package com.sc.stocoin.dao;

import java.util.HashMap;
import java.util.List;

import com.sc.stocoin.model.Member;

public interface MemberDao {

	public Member select(String id);

	public void insert(HashMap<String, Object> userInfo);

	public void delete(String id);

	public void updateDel(String id);

	public int update(Member member);

	public List<Member> list();
	

}
