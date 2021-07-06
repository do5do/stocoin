package com.sc.stocoin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CoinController {
	
	@RequestMapping("/coin/coinList")
	public String coinList() {
		return "coin/coinList";
	}
	
}
