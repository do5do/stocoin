package com.sc.stocoin.service;

import java.util.List;

import com.sc.stocoin.model.TradeStock;

public interface TradeStockService {

	int insert(TradeStock ts);

	int avgContract(String sname, int mno);

	List<TradeStock> tradeList(int mno);

	void deleteMno(int mno);

	
}
