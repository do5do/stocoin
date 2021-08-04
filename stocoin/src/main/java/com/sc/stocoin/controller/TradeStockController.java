package com.sc.stocoin.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sc.stocoin.model.Member;
import com.sc.stocoin.model.MyStock;
import com.sc.stocoin.model.TradeStock;
import com.sc.stocoin.service.MemberService;
import com.sc.stocoin.service.MyStockService;
import com.sc.stocoin.service.StockService;
import com.sc.stocoin.service.TradeStockService;

@Controller
public class TradeStockController {
	@Autowired
	private TradeStockService tss;
	
	@Autowired
	private MemberService ms;
	
	@Autowired
	private MyStockService mss;
	
	@Autowired
	private StockService ss;
	
	@RequestMapping("/stock/tradeStock")
	public String tradeStock(TradeStock ts, MyStock myStock, int types, int contract, String code, Model model, HttpSession session) {
		String id = (String) session.getAttribute("id");
		Member member = ms.select(id);
		
		// setting
		ts.setMno(member.getMno());
		ts.setTypes(types);
		ts.setContract(contract); // 체결 가격
		ts.setCode(code);
		myStock.setMno(member.getMno());
		myStock.setPurchase(contract * ts.getCnt()); // 매입 금액
		myStock.setCode(code);
		
		// 거래내역 insert
		int result = tss.insert(ts);
		
		int stockMoney = member.getStock_money();
		
		// 해당 주 보유현황 확인
		MyStock myStock2 = mss.select(myStock);
		
		// 매수 매도 확인
		if (types == 1) { // 매수
			if (myStock2 == null) { // 첫 번째 매수일 때				
				// 보유현황 insert
				result = mss.insert(myStock);
			} else { // n번째 매수일 때
				result = mss.update(myStock);
			}
			stockMoney -= myStock.getPurchase();
		} else { // 매도
			if (myStock2 == null) { // 매수 이력이 없을때
				result = -1;
			} else if (myStock2.getCnt() < myStock.getCnt()) { // 매도할 주가 가진 주보다 많을때
				result = -2;
			} else {
				result = mss.updateSell(myStock);		
				stockMoney += myStock.getPurchase();
			}
		}
		
		// 잔고 update
		member.setStock_money(stockMoney);
		ms.updateStockMoney(member);
		
		model.addAttribute("result", result);
		return "stock/tradeStock";
	}
	
	@RequestMapping("/myPage/myStockList")
	public String myStock(HttpSession session, Model model) throws IOException, ParseException {
		int mno = (int) session.getAttribute("mno");
		String id = (String) session.getAttribute("id");
		
		Member member = ms.select(id);
		int stockMoney = member.getStock_money();
		
		// 보유현황 리스트
		List<MyStock> myStockList = mss.selectMy(mno);
		
		// 보유현황 + 매매단가 + 실데이터 담을 리스트
		List<Map<String, Object>> totalList = new ArrayList<>();
		
		for (MyStock list : myStockList) {
			Map<String, Object> map = new HashMap<>();
			
			// 매매단가 조회
			int contractAvg = tss.avgContract(list.getSname(), list.getMno());
			// 실 데이터 조회
			Map<String, Object> stockInfo = ss.getStockInfo(list.getCode());
			
			map.put("contractAvg", contractAvg);
			map.put("sname", list.getSname());
			map.put("cnt", list.getCnt());
			map.put("purchase", list.getPurchase());
			map.put("fluc_rt", stockInfo.get("FLUC_RT")); // 등락률
			map.put("recentPrice", ((String)stockInfo.get("TDD_CLSPRC")).replaceAll(",", "")); // 현재가 콤마 제거하여 담기
			
			totalList.add(map);
		}
		
		model.addAttribute("stockMoney", stockMoney);
		model.addAttribute("list", totalList);
		return "myPage/myStockList";
	}
	
	@RequestMapping("/exclude2/stockTradeList")
	public String stockList(HttpSession session, Model model) {
		int mno = (int) session.getAttribute("mno");
		
		// 거래내역 list
		List<TradeStock> list = tss.tradeList(mno);
		
		model.addAttribute("list", list);
		return "exclude2/stockTradeList";
	}
}
