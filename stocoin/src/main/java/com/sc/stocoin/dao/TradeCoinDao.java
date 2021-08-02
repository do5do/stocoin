package com.sc.stocoin.dao;

import java.util.List;

import com.sc.stocoin.model.MyCoin;
import com.sc.stocoin.model.TradeCoin;

public interface TradeCoinDao {
	// 거래내역
	void tradeInsert(TradeCoin tc);
	
	// 보유현황
	MyCoin mySelect(int mno, String name);

	int myInsert(MyCoin mc);

	int myUpdateBuy(MyCoin mc);

	int myUpdateSell(MyCoin mc);

	List<MyCoin> myCoinName(int mno);

	void tradeDelete(int mno);

	void myDelete(int mno);

}
