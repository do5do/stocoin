package com.sc.stocoin.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sc.stocoin.model.Member;
import com.sc.stocoin.model.MyCoin;
import com.sc.stocoin.model.TradeCoin;
import com.sc.stocoin.service.MemberService;
import com.sc.stocoin.service.TradeCoinService;
@Controller
public class TradeCoinController {
	@Autowired
	private TradeCoinService tcs;

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
}
