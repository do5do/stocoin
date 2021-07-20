package com.sc.stocoin.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sc.stocoin.model.Admin;

@Repository
public class AdminDaoImpl implements AdminDao {
	@Autowired
	private SqlSessionTemplate sst;
	
	@Override
	public Admin select(String id) {
		return sst.selectOne("adminns.select", id);
	}
	
	@Override
	public void deleteList(String id) {
		sst.update("adminns.deleteList", id);
	}
}
