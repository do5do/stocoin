package com.sc.stocoin.dao;

import java.util.List;

import com.sc.stocoin.model.FavoriteStock;

public interface FavoriteStockDao {

	FavoriteStock select(FavoriteStock fs);

	void insertFavo(FavoriteStock fs);

	void deleteFavo(FavoriteStock fs);

	List<FavoriteStock> selectFavo(int mno);

	void deleteMno(int mno);

}
