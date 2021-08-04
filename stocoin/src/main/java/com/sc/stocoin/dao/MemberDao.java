package com.sc.stocoin.dao;

import java.util.HashMap;
import java.util.List;

import com.sc.stocoin.model.Member;

public interface MemberDao {

	public Member select(String id);

	public void insert(HashMap<String, Object> userInfo);

	public void delete(String id);

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
