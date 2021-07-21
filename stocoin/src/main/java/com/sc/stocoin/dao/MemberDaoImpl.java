package com.sc.stocoin.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sc.stocoin.model.Member;

@Repository
public class MemberDaoImpl implements MemberDao	{
	@Autowired
	private SqlSessionTemplate sst;
	
	public Member select(String id) {
		return sst.selectOne("memberns.select", id);
	}

	public void insert(HashMap<String, Object> userInfo) {
		sst.insert("memberns.insert", userInfo);
	}

	public void delete(String id) {
		sst.update("memberns.delete", id);
	}

	public void updateDel(HashMap<String, Object> userInfo) {
		sst.update("memberns.updateDel", userInfo);
	}

	public int update(Member member) {
		return sst.update("memberns.update", member);
	}

	@Override
	public List<Member> list(Member member) {
		return sst.selectList("memberns.list", member);
	}

	@Override
	public int getTotal(Member member) {
		return sst.selectOne("memberns.getTotal", member);
	}

	@Override
	public List<Member> adminPage() {
		return sst.selectList("memberns.adminPage");
	}



}