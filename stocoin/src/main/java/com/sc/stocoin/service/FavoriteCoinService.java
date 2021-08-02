package com.sc.stocoin.service;

import com.sc.stocoin.model.FavoriteCoin;

public interface FavoriteCoinService {

	FavoriteCoin select(int mno, String name);

	void insert(int mno, String name);

	void delete(int mno, String name);

	void deleteMno(int mno);

}
