package com.sc.stocoin.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sc.stocoin.model.Admin;
import com.sc.stocoin.model.Member;

@Repository
public class AdminDaoImpl implements AdminDao {
	@Autowired
	private SqlSessionTemplate sst;

	public Admin select(String id) {
		return sst.selectOne("adminns.select", id);
	}
}