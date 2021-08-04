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

	public void updateDel(HashMap<String, Object> userInfo);

	public int update(Member member);

	public List<Member> list(Member member);

	public int getTotal(Member member);

	public List<Member> adminPage();

	public Member selectNick(String nick);

	public void updateStockMoney(Member member);

	public void updateCoinMoney(Member member);

	public void updateAllStock();

	public void updateAllCoin();

	public void resetMoney();
}
