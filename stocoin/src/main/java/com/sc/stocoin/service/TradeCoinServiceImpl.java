package com.sc.stocoin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.stocoin.dao.TradeCoinDao;
import com.sc.stocoin.model.MyCoin;
import com.sc.stocoin.model.TradeCoin;
import com.sc.stocoin.model.TradeStock;

@Service
public class TradeCoinServiceImpl implements TradeCoinService {
	@Autowired
	private TradeCoinDao tcd;
	
	// 거래내역
	@Override 	
	public void tradeInsert(TradeCoin tc) {
		tcd.tradeInsert(tc);
	}
	
	@Override
	public void tradeDelete(int mno) {
		tcd.tradeDelete(mno);
	}

	@Override
	public int avgContract(String cname, int mno) {
		return tcd.avgContract(cname, mno);
	}

	@Override
	public List<TradeStock> tradeList(int mno) {
		return tcd.tradeList(mno);
	}

	//보유 현황
	@Override
	public MyCoin mySelect(int mno, String name) {
		return tcd.mySelect(mno, name);
	}

	@Override
	public int myInsert(MyCoin mc) {
		return tcd.myInsert(mc);
	}

	@Override
	public int myUpdateBuy(MyCoin mc) {
		return tcd.myUpdateBuy(mc);
	}

	@Override
	public int myUpdateSell(MyCoin mc) {
		return tcd.myUpdateSell(mc);
	}

	@Override
	public List<MyCoin> myCoinName(int mno) {
		return tcd.myCoinName(mno);
	}

	@Override
	public void myDelete(int mno) {
		tcd.myDelete(mno);
	}

	@Override
	public List<MyCoin> myCoinList(int mno) {
		return tcd.myCoinList(mno);
	}


}
