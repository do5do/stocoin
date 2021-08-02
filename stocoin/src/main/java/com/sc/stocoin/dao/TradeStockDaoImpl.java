package com.sc.stocoin.dao;

import java.util.List;

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

	@Override
	public int avgContract(String sname) {
		return sst.selectOne("tradestockns.avgContract", sname);
	}

	@Override
	public List<TradeStock> tradeList(int mno) {
		return sst.selectList("tradestockns.tradeList", mno);
	}
}
