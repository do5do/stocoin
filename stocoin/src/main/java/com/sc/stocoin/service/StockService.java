package com.sc.stocoin.service;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

public interface StockService {
	List<Map<String, Object>> getStockList() throws IOException, ParseException;

	List<Map<String, Object>> stockListSort(String kind, String sort);

	Map<String, Object> getStockInfo(String code);
	
	String getChart(String code, String time) throws IOException;
}
