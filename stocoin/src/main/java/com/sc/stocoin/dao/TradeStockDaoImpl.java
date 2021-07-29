package com.sc.stocoin.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sc.stocoin.model.TradeStock;

@Repository
public class TradeStockDaoImpl implements TradeStockDao {
	@Autowired
	private SqlSessionTemplate sst;

	@Override
	public int insert(TradeStock ts) {
		return sst.insert("tradestockns.insert", ts);
	}
}
