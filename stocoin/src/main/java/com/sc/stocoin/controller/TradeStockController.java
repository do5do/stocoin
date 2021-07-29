package com.sc.stocoin.controller;

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
import com.sc.stocoin.service.TradeStockService;

@Controller
public class TradeStockController {
	@Autowired
	private TradeStockService tss;
	
	@Autowired
	private MemberService ms;
	
	@Autowired
	private MyStockService mss;
	
	@RequestMapping("/stock/tradeStock")
	public String tradeStock(TradeStock ts, MyStock myStock, int types, int contract, String code, Model model, HttpSession session) {
		int mno = (int) session.getAttribute("mno");
		String id = (String) session.getAttribute("id");
		
		// setting
		ts.setMno(mno);
		ts.setTypes(types);
		ts.setContract(contract); // 체결 가격
		myStock.setMno(mno);
		myStock.setPurchase(contract * ts.getCnt()); // 매입 금액
		
		// 거래내역 insert
		int result = tss.insert(ts);
		
		// 매수 매도 확인
		Member member = ms.select(id);
		int stockMoney = member.getStock_money();
		
		// 해당 주 보유현황 확인
		MyStock myStock2 = mss.select(myStock);
		
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
		model.addAttribute("code", code);
		return "stock/tradeStock";
	}
}
