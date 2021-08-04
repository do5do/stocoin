package com.sc.stocoin.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sc.stocoin.model.FavoriteStock;
import com.sc.stocoin.model.Member;
import com.sc.stocoin.model.MyStock;
import com.sc.stocoin.service.FavoriteStockService;
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
	
	@Autowired
	private FavoriteStockService fss;
	
	private List<Map<String, Object>> stockLists;
	
	@RequestMapping("/stock/stockList")
	public String stockList(Model model) throws IOException, ParseException {
		// 첫 실행때만 실제 리스트 로딩
		if (stockLists == null) {
			List<Map<String, Object>> stockList = ss.getStockList();			
			this.stockLists = stockList;
		}
		return "stock/stockList";
	}

	@RequestMapping("/exclude2/stockListReload")
	public String stockListReload(Model model, String kind, String sort, String tab, String search, String code, HttpSession session) throws IOException, ParseException {
		String id = (String) session.getAttribute("id");
		
		Member member = null;
		List<FavoriteStock> favoriteList = null;
		
		if (id != null && !id.equals("admin")) {
			member = ms.select(id);
			// 관심 조회
			favoriteList = fss.selectFavo(member.getMno());
		}
		
		// list setting
		List<Map<String, Object>> stockList = new ArrayList<>();
		
		// tab control
		if (tab.equals("all")) { // 전체
			// 검색
			if (search == null || search.equals("")) {
				stockList = ss.stockListSort(kind, sort, stockLists);
			} else {
				stockList = ss.getStockSearch(search, stockLists);
			}
		} else if (tab.equals("my")) { // 보유
			List<MyStock> myStockList = mss.selectMy(member.getMno());

			for (MyStock ms : myStockList) {
				Map<String, Object> stockInfo = ss.getStockInfo(ms.getCode());
				stockList.add(stockInfo);
			}
			
			if (search == null || search.equals("")) {
			} else {
				stockList = ss.getStockSearch(search, stockList);
			}
			// sort list setting
			stockList = ss.stockListSort(kind, sort, stockList);
		} else { // 관심
			for (FavoriteStock fs : favoriteList) {
				Map<String, Object> stockInfo = ss.getStockInfo(fs.getCode());
				stockList.add(stockInfo);
			}
			
			if (search == null || search.equals("")) {
			} else {
				stockList = ss.getStockSearch(search, stockList);
			}
			// sort list setting
			stockList = ss.stockListSort(kind, sort, stockList);
		}
		
		model.addAttribute("favoriteList", favoriteList);
		model.addAttribute("stockList", stockList);
		model.addAttribute("tab", tab);
		model.addAttribute("code", code);
		return "exclude2/stockListReload";
	}

	@RequestMapping("/exclude2/stockInfo")
	public String stockInfo(String code, Model model, HttpSession session) throws IOException, ParseException {
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
		if (id != null && !id.equals("admin")) {
			Member member = ms.select(id);
			model.addAttribute("member", member);
			
			// 회원이 해당 주식을 보유했으면
			MyStock myStock = mss.selectCnt(sname, member.getMno());
			
			if (myStock != null) {
				model.addAttribute("cnt", myStock.getCnt());	
			} else {
				model.addAttribute("cnt", 0);
			}
		}
		model.addAttribute("stockInfo", stockInfo);
		return "exclude2/stockInfo";
	}
	
	@RequestMapping("/exclude2/stockChart")
	public String stockChart(String code, String time, Model model) throws IOException, ParseException {
		if (code == null) 
			code = "005930"; // 삼성전자
		
		if (time == null)
			time = "1d";
		String chartData = ss.getChart(code, time);
		model.addAttribute("stockChart", chartData);
		return "/exclude2/stockChart";
	}
	
	@RequestMapping("/exclude/financialStatement/code/{code}")
	public String financialStatement(@PathVariable String code, Model model) throws IOException {
		String year = "2020";
		List<Map<String,Object>> fs = ss.getFinancialStatement(code, year);
		model.addAttribute("fsList", fs);
		return "exclude/financialStatement";
	}
	
	@RequestMapping("/stock/changeStar")
	@ResponseBody
	public String changeStar(FavoriteStock fs, HttpSession session) {
		// 관심 조회
		FavoriteStock fs2 = fss.select(fs);
		String data = "";
		
		if (fs2 == null) {
			fss.insertFavo(fs);
			data = "1";
		} else {
			fss.deleteFavo(fs);
			data = "2";
		}
		
		return data;
	}
	
}
