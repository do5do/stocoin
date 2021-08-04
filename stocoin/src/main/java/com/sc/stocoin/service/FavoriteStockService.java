package com.sc.stocoin.service;

import java.util.List;

import com.sc.stocoin.model.FavoriteStock;

public interface FavoriteStockService {

	FavoriteStock select(FavoriteStock fs);

	void insertFavo(FavoriteStock fs);

	void deleteFavo(FavoriteStock fs);

	List<FavoriteStock> selectFavo(int mno);

	void deleteMno(int mno);

}
