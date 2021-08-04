package com.sc.stocoin.service;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

public interface StockService {
	List<Map<String, Object>> getStockList() throws IOException;

	List<Map<String, Object>> stockListSort(String kind, String sort, List<Map<String, Object>> stockList);

	Map<String, Object> getStockInfo(String code) throws IOException, ParseException;
	
	String getChart(String code, String time) throws IOException;
	
	List<Map<String, Object>> getFinancialStatement(String code, String year) throws IOException;
	
	List<Map<String, Object>> getStockSearch(String search, List<Map<String, Object>> stockList);
	
}
