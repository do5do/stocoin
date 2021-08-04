package com.sc.stocoin.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sc.stocoin.model.Member;
import com.sc.stocoin.model.MyCoin;
import com.sc.stocoin.model.TradeCoin;
import com.sc.stocoin.model.TradeStock;
import com.sc.stocoin.service.CoinService;
import com.sc.stocoin.service.MemberService;
import com.sc.stocoin.service.TradeCoinService;
@Controller
public class TradeCoinController {
	@Autowired
	private TradeCoinService tcs;

	@Autowired
	private CoinService cs;
	
	@Autowired
	private MemberService ms;
	
	@RequestMapping("/coin/tradeCoin")
	public String tradeCoin(TradeCoin tc, MyCoin mc, Model model, HttpSession session) {
		int mno = (int) session.getAttribute("mno");
		String id = (String) session.getAttribute("id");
		
		// setting
		tc.setMno(mno);
		mc.setMno(mno);
		
		// 거래내역
		tcs.tradeInsert(tc);
		
		// 현재 코인 머니 get
		Member member = ms.select(id);
		int coin_money = member.getCoin_money();

		// 보유현황
		MyCoin mycoin = tcs.mySelect(mno, mc.getCname());
		int result = 0;
		if (tc.getTypes() == 1) {
			if (mycoin == null) { // 첫 매수
				result = tcs.myInsert(mc);
			} else { // 보유하고 있는 코인 매수
				result = tcs.myUpdateBuy(mc);
			}
			coin_money -= mc.getPurchase();
			
		} else { // 매도
			result = tcs.myUpdateSell(mc);
			coin_money += mc.getPurchase();
		}
		
		member.setCoin_money(coin_money);
		ms.updateCoinMoney(member);
		
		model.addAttribute("result", result);
		
		return "coin/tradeCoin";
	}
	
	@RequestMapping("/myPage/myCoinList")
	public String myCoin(HttpSession session, Model model) {
		String id = (String) session.getAttribute("id");
		Member member = ms.select(id);
		int coinMoney = member.getCoin_money();
		
		model.addAttribute("coinMoney", coinMoney);
		return "myPage/myCoinList";
	}
	
	@RequestMapping("/exclude2/myCoinList")
	public String myCoinList(HttpSession session, Model model) throws IOException {
		int mno = (int) session.getAttribute("mno");
		String id = (String) session.getAttribute("id");
		
		Member member = ms.select(id);
		int coinMoney = member.getCoin_money();
		
		List<MyCoin> myCoinList = tcs.myCoinList(mno);
		List<Map<String, Object>> totalList = new ArrayList<>();
		
		for (MyCoin list : myCoinList) {
			Map<String, Object> map = new HashMap<>();
			int contractAvg = tcs.avgContract(list.getCname(), mno);
			Map<String, String> coinInfo = cs.getCoinInfo(list.getCname());
			
			map.put("contractAvg", contractAvg);
			map.put("cname_ko", list.getCname_ko());
			map.put("cname", list.getCname());
			map.put("cnt", list.getCnt());
			map.put("purchase", list.getPurchase());
			map.put("fluc_rt", coinInfo.get("fluctate_rate_24H"));
			map.put("closing_price", coinInfo.get("closing_price"));
			
			totalList.add(map);
		}
		
		
		model.addAttribute("coinMoney", coinMoney);
		model.addAttribute("list", totalList);
		return "exclude2/myCoinList";
	}
	
	@RequestMapping("/exclude2/tradeCoinList")
	public String tradeList(HttpSession session, Model model) {
		int mno = (int) session.getAttribute("mno");
		
		// 거래내역 list
		List<TradeStock> list = tcs.tradeList(mno);
		
		model.addAttribute("list", list);
		return "exclude2/tradeCoinList";
	}

	
}
