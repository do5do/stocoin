package com.sc.stocoin.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sc.stocoin.model.Member;
import com.sc.stocoin.service.CoinService;
import com.sc.stocoin.service.MemberService;

@Controller
public class CoinController {
	
	@Autowired
	private CoinService cs;

	@Autowired
	private MemberService ms;
	
	@RequestMapping("/coin/coinList")
	public String coinList(Model model, String name, HttpSession session) throws IOException {
		return "coin/coinList";
	}

	@RequestMapping("/exclude2/coinListReload")
	public String coinListReload(Model model, String kind, String sort, String name) throws IOException, ParseException {
		List<Map<String, Object>> coinList = cs.getCoinList(kind, sort);
		model.addAttribute("name", name);
		model.addAttribute("coinList", coinList);
		return "exclude2/coinListReload";
	}

	@RequestMapping("/exclude2/coinInfo")
	public String coinChart(Model model, String name) throws IOException {
		Map<String, String> coinInfo = cs.getCoinInfo(name);
		model.addAttribute("name", name);
		model.addAttribute("coinInfo", coinInfo);
		return "exclude2/coinInfo";
	}

	@RequestMapping("/exclude2/coinTrade")
	public String coinTrade(Model model, String name, HttpSession session) throws IOException {
		String id = (String) session.getAttribute("id");
		if (id != null) {			
			Member member = ms.select(id);
			model.addAttribute("coin_money", member.getCoin_money());
		}
		Map<String, String> coinInfo = cs.getCoinInfo(name);
		model.addAttribute("closing_price", coinInfo.get("closing_price"));
		model.addAttribute("name", name);
		return "exclude2/coinTrade";
	}
}
