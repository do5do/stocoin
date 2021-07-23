package com.sc.stocoin.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sc.stocoin.service.CoinService;
import com.sc.stocoin.service.StockService;

@Controller
public class StockController {
	
	@Autowired
	private StockService ss;
	
	@RequestMapping("/stock/stockList")
	public String stockList(Model model) throws IOException, ParseException {
		List<Map<String, Object>> stockList = ss.getStockList();
		
		return "stock/stockList";
	}

	@RequestMapping("/exclude2/stockListReload")
	public String stockListReload(Model model, String kind, String sort) throws IOException, ParseException {
		List<Map<String, Object>> stockListTemp = ss.stockListSort(kind, sort);
		model.addAttribute("stockList", stockListTemp);
		return "exclude2/stockListReload";
	}

	@RequestMapping("/exclude2/stockInfo")
	public String stockInfo(String name, Model model) {
		if (name == null) {
			name = "삼성전자";
		}
		Map<String, Object> stockInfo = ss.getStockInfo(name);
		model.addAttribute("stockInfo", stockInfo);
		return "exclude2/stockInfo";
	}
}
