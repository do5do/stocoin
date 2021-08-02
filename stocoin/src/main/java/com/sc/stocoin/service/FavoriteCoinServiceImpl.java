package com.sc.stocoin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.stocoin.dao.FavoriteCoinDao;
import com.sc.stocoin.model.FavoriteCoin;

@Service
public class FavoriteCoinServiceImpl implements FavoriteCoinService {
	@Autowired
	private FavoriteCoinDao fcd;

	@Override
	public FavoriteCoin select(int mno, String name) {
		return fcd.select(mno, name);
	}

	@Override
	public void insert(int mno, String name) {
		fcd.insert(mno, name);
	}

	@Override
	public void delete(int mno, String name) {
		fcd.delete(mno, name);
	}

	@Override
	public void deleteMno(int mno) {
		fcd.deleteMno(mno);
	}
	

}
