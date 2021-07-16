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
		List<Map<String, String>> coinList = cs.getCoinInfo();
		List<Map<String, String>> Fluctuation_Rate = cs.getFluctuation_Rate();
//		List<String> chartList = cs.getChartList(coinList);
		
		model.addAttribute("coinList", coinList);
		model.addAttribute("Fluctuation_Rate", Fluctuation_Rate);
//		model.addAttribute("chartList", chartList);
		
		return "coin/coinList";
	}

	
}
