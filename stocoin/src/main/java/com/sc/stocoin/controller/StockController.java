package com.sc.stocoin.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sc.stocoin.model.Member;
import com.sc.stocoin.model.MyStock;
import com.sc.stocoin.service.MemberService;
import com.sc.stocoin.service.MyStockService;
import com.sc.stocoin.service.StockService;

@Controller
public class StockController {
	@Autowired
	private StockService ss;
	
	@Autowired
	private MemberService ms;
	
	@Autowired
	private MyStockService mss;
	
	private List<Map<String, Object>> stockLists;
	
	@RequestMapping("/stock/stockList")
	public String stockList(Model model, String code) throws IOException, ParseException {
		// 첫 실행때만 실제 리스트 로딩
		if (stockLists == null) {
			List<Map<String, Object>> stockList = ss.getStockList();			
			this.stockLists = stockList;
		}
		// 체결 후 체결한 주식 코드 값 전달
		if (code != null) {			
			model.addAttribute("code", code);
		}
		return "stock/stockList";
	}

	@RequestMapping("/exclude2/stockListReload")
	public String stockListReload(Model model, String kind, String sort, String code) throws IOException, ParseException {
		List<Map<String, Object>> stockListTemp = ss.stockListSort(kind, sort);
		model.addAttribute("stockList", stockListTemp);
		
		// 체결 후 체결한 주식 코드 값 전달
		if (code != null) {			
			model.addAttribute("code", code);
		}
		return "exclude2/stockListReload";
	}

	@RequestMapping("/exclude2/stockInfo")
	public String stockInfo(String code, Model model, HttpSession session) {
		String id = (String) session.getAttribute("id");
		
		// default 삼성전자
		if (code == null) {
			code = "005930";
		}
		// 선택한 주식 정보 로드
		Map<String, Object> stockInfo = ss.getStockInfo(code);
		// 선택한 주식 명
		String sname = (String) stockInfo.get("ISU_ABBRV");
		
		// 로그인 한 회원 가진 잔금, 주식 현황
		if (id != null) {
			Member member = ms.select(id);
			model.addAttribute("member", member);
			
			// 회원이 해당 주식을 보유했으면
			MyStock myStock = mss.selectCnt(sname, member.getMno());
			if (myStock != null) {
				model.addAttribute("cnt", myStock.getCnt());	
			}
		}
		model.addAttribute("stockInfo", stockInfo);
		return "exclude2/stockInfo";
	}
	
	@RequestMapping("/exclude2/stockChart")
	public String stockChart(String code, Model model) throws IOException, ParseException {
		if (code == null) {
			code = "005930"; // 삼성전자
		}
		String chartData = ss.getChart(code);
		model.addAttribute("stockChart", chartData);
		return "/exclude2/stockChart";
	}
	
}
