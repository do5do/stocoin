package com.sc.stocoin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.stocoin.dao.FavoriteStockDao;
import com.sc.stocoin.model.FavoriteStock;

@Service
public class FavoriteStockServiceImpl implements FavoriteStockService {
	@Autowired
	private FavoriteStockDao fsd;

	@Override
	public FavoriteStock select(FavoriteStock fs) {
		return fsd.select(fs);
	}

	@Override
	public void insertFavo(FavoriteStock fs) {
		fsd.insertFavo(fs);
	}

	@Override
	public void deleteFavo(FavoriteStock fs) {
		fsd.deleteFavo(fs);
	}

	@Override
	public List<FavoriteStock> selectFavo(int mno) {
		return fsd.selectFavo(mno);
	}

	@Override
	public void deleteMno(int mno) {
		fsd.deleteMno(mno);
	}
}
