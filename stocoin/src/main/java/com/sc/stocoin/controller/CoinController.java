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
		return "coin/coinList";
	}

	@RequestMapping("/exclude2/coinListReload")
	public String coinListReload(Model model, String kind, String sort) throws IOException, ParseException {
		List<Map<String, Object>> coinList = cs.getCoinInfo(kind, sort);
		model.addAttribute("coinList", coinList);
		return "exclude2/coinListReload";
	}

	@RequestMapping("/exclude2/coinChart")
	public String coinChart(Model model, String name) throws IOException, ParseException {
		if (name == null || name.equals("")) {
			name = "BTC";
		}
		model.addAttribute("name", name);
		return "exclude2/coinChart";
	}
}
