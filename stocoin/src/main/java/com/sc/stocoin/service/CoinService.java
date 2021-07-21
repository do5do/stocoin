package com.sc.stocoin.service;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

public interface CoinService {

	List<Map<String, Object>> getCoinInfo(String kind, String sort) throws IOException, ParseException;
	
//	List<String> getChartList(List<Map<String, String>> coinList) throws IOException;

}
