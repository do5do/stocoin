package com.sc.stocoin.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sc.stocoin.service.StockService;

@Controller
public class StockController {
	
	@Autowired
	private StockService ss;
	
	@RequestMapping("/stock/stockList")
	public String stockList(Model model) throws IOException, ParseException {
		return "stock/stockList";
	}

	@RequestMapping("/exclude2/stockListReload")
	public String stockListReload(Model model) throws IOException, ParseException {
		List<Map<String, String>> stockList = ss.getStockInfo();
		model.addAttribute("stockList", stockList);
		
		return "exclude2/stockListReload";
	}
	@RequestMapping("/exclude2/stockChart")
	public String stockChart(Model model, HttpServletRequest request) throws IOException, ParseException {
		String name = (String) request.getAttribute("name");
		String chartData = ss.getChart(name);
		model.addAttribute("stockChart", chartData);
		return "/exclude2/stockChart";
	}
	
}
