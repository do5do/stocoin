package com.sc.stocoin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.sc.stocoin.dao.TradeDao;

@Service
public class TradeServiceImpl implements TradeService {
	@Autowired
	private TradeDao td;

}
