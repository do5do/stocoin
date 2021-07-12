package com.sc.stocoin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sc.stocoin.dao.TradeDao;

@Repository
public class TradeServiceImpl implements TradeService {
	@Autowired
	private TradeDao td;
}
