package com.sc.stocoin.service;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import com.sc.stocoin.model.Member;

public interface MemberService {
	public String getAccessToken(String authorize_code) throws IOException;

	public HashMap<String, Object> getUserInfo(String access_Token) throws IOException;

	public Member select(String id);

	public void insert(HashMap<String, Object> userInfo);

	public void delete(String access_Token, String id) throws IOException;

	public void updateDel(String id);

	public int update(Member member);

	public List<Member> member(String id);
}
