package com.sc.stocoin.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sc.stocoin.model.FavoriteStock;

@Repository
public class FavoriteStockDaoImpl implements FavoriteStockDao {
	@Autowired
	private SqlSessionTemplate sst;

	@Override
	public FavoriteStock select(FavoriteStock fs) {
		return sst.selectOne("favoriteStockns.select", fs);
	}

	@Override
	public void insertFavo(FavoriteStock fs) {
		sst.insert("favoriteStockns.insertFavo", fs);
	}

	@Override
	public void deleteFavo(FavoriteStock fs) {
		sst.delete("favoriteStockns.deleteFavo", fs);
	}

	@Override
	public List<FavoriteStock> selectFavo(int mno) {
		return sst.selectList("favoriteStockns.selectFavo", mno);
	}

	@Override
	public void deleteMno(int mno) {
		sst.delete("favoriteStockns.deleteMno", mno);
	}
}
