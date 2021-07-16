package com.sc.stocoin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sc.stocoin.service.TradeService;
@Controller
public class TradeController {
	@Autowired
	private TradeService ts;
	
	@RequestMapping("/myPage/myCoinList")
	public String coinList() {
		return "myPage/myCoinList";
	}
}
