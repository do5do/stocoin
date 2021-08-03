package com.sc.stocoin.dao;

import java.util.List;

import com.sc.stocoin.model.TradeStock;

public interface TradeStockDao {

	int insert(TradeStock ts);

	int avgContract(String sname, int mno);

	List<TradeStock> tradeList(int mno);

	void deleteMno(int mno);

}
