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

@Controller
public class CoinController {
	
	@Autowired
	private CoinService cs;
	
	@RequestMapping("/coin/coinList")
	public String coinList(Model model) throws IOException, ParseException {
//		List<String> chartList = cs.getChartList(coinList);
		
//		model.addAttribute("chartList", chartList);
//		System.out.println("??????????");
		return "coin/coinList";
	}

	@RequestMapping("/exclude2/coinListReload")
	public String coinListReload(Model model) throws IOException, ParseException {
		List<Map<String, String>> coinList = cs.getCoinInfo();
		model.addAttribute("coinList", coinList);
		
		return "exclude2/coinListReload";
	}

	
}
