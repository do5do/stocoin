package com.sc.stocoin.service;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

public interface CoinService {
	List<Map<String, Object>> initialCoinList(HttpSession session) throws IOException;
	
	List<Map<String, Object>> getCoinList(String kind, String sort, String coin_tab, String val, HttpSession session) throws IOException, ParseException;
 
	Map<String, String> getCoinInfo(String name) throws IOException;
	
	void changeCoinStar(String name);
}
