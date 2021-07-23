package com.sc.stocoin.service;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

public interface CoinService {

	List<Map<String, Object>> getCoinList(String kind, String sort) throws IOException, ParseException;
 
	Map<String, String> getCoinInfo(String name) throws IOException;
	
//	List<String> getChartList(List<Map<String, String>> coinList) throws IOException;

}
