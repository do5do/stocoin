package com.sc.stocoin.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sc.stocoin.model.Coin;
import com.sc.stocoin.model.FavoriteCoin;
import com.sc.stocoin.model.Member;
import com.sc.stocoin.model.MyCoin;
import com.sc.stocoin.service.CoinService;
import com.sc.stocoin.service.FavoriteCoinService;
import com.sc.stocoin.service.MemberService;
import com.sc.stocoin.service.TradeCoinService;

@Controller
public class CoinController {
	
	@Autowired
	private CoinService cs;

	@Autowired
	private MemberService ms;
	
	@Autowired
	private TradeCoinService tcs;

	@Autowired
	private FavoriteCoinService fcs;
	
	@RequestMapping("/coin/coinList")
	public String coinList(HttpSession session) throws IOException {
		cs.initialCoinList(session);
		return "coin/coinList";
	}
	
	@RequestMapping("/coin/refresh")
	@ResponseStatus(value = HttpStatus.OK)
	public void refresh(HttpSession session) throws IOException {
		cs.initialCoinList(session);
	}
	
	// coin list(interval)
	@RequestMapping("/exclude2/coinListReload")
	public String coinListReload(String val, String kind, String sort, String name, String coin_tab,
					Model model, HttpSession session) throws IOException, ParseException {
		List<Map<String, Object>> coinList = cs.getCoinList(kind, sort, coin_tab, val, session);
		model.addAttribute("name", name);
		model.addAttribute("coin_tab", coin_tab);
		model.addAttribute("coinList", coinList);
		return "exclude2/coinListReload";
	}

	// coin info(interval)
	@RequestMapping("/exclude2/coinInfo")
	public String coinChart(Model model, String name) throws IOException {
		Map<String, String> coinInfo = cs.getCoinInfo(name);
		model.addAttribute("name", name);
		model.addAttribute("coinInfo", coinInfo);
		return "exclude2/coinInfo";
	}
	
	// coin trade
	@RequestMapping("/exclude2/coinTrade")
	public String coinTrade(Model model, String name, HttpSession session) throws IOException {
		String id = (String) session.getAttribute("id");
		Map<String, String> coinInfo = cs.getCoinInfo(name);
		if (id != null && !id.equals("admin")) {			
			int mno = (int) session.getAttribute("mno");
			Member member = ms.select(id);
			model.addAttribute("coin_money", member.getCoin_money());
			MyCoin mycoin = tcs.mySelect(mno, name);
			if (mycoin != null)
				model.addAttribute("cnt", mycoin.getCnt());
			else
				model.addAttribute("cnt", 0);
		}

		model.addAttribute("name", name); 
		model.addAttribute("closing_price", coinInfo.get("closing_price"));
		model.addAttribute("cname_ko", coinInfo.get("cname_ko"));
		return "exclude2/coinTrade";
	}
	
	@RequestMapping("/coin/favoriteCoin")
	@ResponseBody
	public String favoriteCoin(String name, Model model, HttpSession session) {
		cs.changeCoinStar(name);
		String star = "";
		int mno = (int) session.getAttribute("mno");
		FavoriteCoin fc = fcs.select(mno, name);
		if (fc == null) {
			fcs.insert(mno, name);
			star = "1";
		} else { 
			fcs.delete(mno, name);
			star = "2";
		}
		return star;
	}

}
