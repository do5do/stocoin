package com.sc.stocoin.service;

import java.util.List;

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

	@Override
	public int avgContract(String sname, int mno) {
		return tsd.avgContract(sname, mno);
	}

	@Override
	public List<TradeStock> tradeList(int mno) {
		return tsd.tradeList(mno);
	}

	@Override
	public void deleteMno(int mno) {
		tsd.deleteMno(mno);
	}
}
