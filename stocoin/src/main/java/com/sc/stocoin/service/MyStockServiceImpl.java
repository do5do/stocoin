package com.sc.stocoin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.stocoin.dao.MyStockDao;
import com.sc.stocoin.model.MyStock;

@Service
public class MyStockServiceImpl implements MyStockService {
	@Autowired
	private MyStockDao msd;

	@Override
	public int insert(MyStock myStock) {
		return msd.insert(myStock);
	}

	@Override
	public MyStock select(MyStock myStock) {
		return msd.select(myStock);
	}

	@Override
	public int update(MyStock myStock) {
		return msd.update(myStock);
	}

	@Override
	public int updateSell(MyStock myStock) {
		return msd.updateSell(myStock);
	}

	@Override
	public MyStock selectCnt(String sname, int mno) {
		return msd.selectCnt(sname, mno);
	}

	
}
