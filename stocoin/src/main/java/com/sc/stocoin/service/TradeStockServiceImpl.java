package com.sc.stocoin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.stocoin.dao.TradeStockDao;
import com.sc.stocoin.model.TradeStock;

@Service
public class TradeStockServiceImpl implements TradeStockService {
	@Autowired
	private TradeStockDao tsd;

	@Override
	public int insert(TradeStock ts) {
		return tsd.insert(ts);
	}
}
