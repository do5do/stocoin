package com.sc.stocoin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sc.stocoin.service.TradeCoinService;
@Controller
public class TradeController {
	@Autowired
	private TradeCoinService ts;
	
	@RequestMapping("/myPage/myCoinList")
	public String coinList() {
		return "myPage/myCoinList";
	}
	@RequestMapping("/exclude2/coinTradeList")
	public String tradeList() {
		return "exclude2/coinTradeList";
	}
	
	
}
