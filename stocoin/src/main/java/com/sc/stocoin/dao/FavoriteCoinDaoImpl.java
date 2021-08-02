package com.sc.stocoin.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sc.stocoin.model.FavoriteCoin;

@Repository
public class FavoriteCoinDaoImpl implements FavoriteCoinDao {
	@Autowired
	private SqlSessionTemplate sst;

	@Override
	public FavoriteCoin select(int mno, String name) {
		HashMap<String, Object> hm = new HashMap<String, Object>();
		hm.put("mno", mno);
		hm.put("cname", name);
		return sst.selectOne("favoriteCoinns.select", hm);
	}

	@Override
	public void insert(int mno, String name) {
		HashMap<String, Object> hm = new HashMap<String, Object>();
		hm.put("mno", mno);
		hm.put("cname", name);		
		sst.insert("favoriteCoinns.insert", hm);
	}

	@Override
	public void delete(int mno, String name) {
		HashMap<String, Object> hm = new HashMap<String, Object>();
		hm.put("mno", mno);
		hm.put("cname", name);		
		sst.delete("favoriteCoinns.delete", hm);
	}

	@Override
	public List<FavoriteCoin> favoriteCoinName(int mno) {
		return sst.selectList("favoriteCoinns.favoriteCoinName", mno);
	}

	@Override
	public void deleteMno(int mno) {
		sst.delete("favoriteCoinns.deleteMno", mno);
	}
	
	
}
