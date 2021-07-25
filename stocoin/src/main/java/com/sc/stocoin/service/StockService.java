package com.sc.stocoin.service;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

public interface StockService {
	List<Map<String, String>> getStockInfo() throws IOException;
	String getChart(String name) throws IOException;
}
