package com.sc.stocoin.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TradeDaoImpl implements TradeDao {
	@Autowired
	private SqlSessionTemplate sst;
}
