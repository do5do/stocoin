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
	public String coinList() {
		return "coin/coinList";
	}

	@RequestMapping("/exclude2/coinListReload")
	public String coinListReload(Model model, String kind, String sort) throws IOException, ParseException {
		List<Map<String, Object>> coinList = cs.getCoinList(kind, sort);
		model.addAttribute("coinList", coinList);
		return "exclude2/coinListReload";
	}

	@RequestMapping("/exclude2/coinInfo")
	public String coinChart(Model model, String name) throws IOException {
		if (name == null || name.equals("")) {
			name = "BTC";
		} 
		Map<String, String> coinInfo = cs.getCoinInfo(name);
		model.addAttribute("name", name);
		model.addAttribute("coinInfo", coinInfo);
		return "exclude2/coinInfo";
	}
}
