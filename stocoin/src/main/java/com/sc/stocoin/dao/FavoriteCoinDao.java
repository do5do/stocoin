package com.sc.stocoin.dao;

import java.util.List;

import com.sc.stocoin.model.FavoriteCoin;

public interface FavoriteCoinDao {

	FavoriteCoin select(int mno, String name);

	void insert(int mno, String name);

	void delete(int mno, String name);

	List<FavoriteCoin> favoriteCoinName(int mno);

	void deleteMno(int mno);

}
