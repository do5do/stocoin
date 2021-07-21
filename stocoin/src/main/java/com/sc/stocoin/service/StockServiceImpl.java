package com.sc.stocoin.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sc.stocoin.dao.StockDao;

@Service
public class StockServiceImpl implements StockService {
	@Autowired
	private StockDao cd;

	@Override
	public List<Map<String, String>> getStockInfo() throws IOException, ParseException {
		// 연결 URL 설정
		String requestURL = "bld=dbms/MDC/STAT/standard/MDCSTAT01501&mktId=ALL&share=1&money=1&csvxls_isNo=false&trdDd=";
		URL otpURL = new URL("http://data.krx.co.kr/comm/bldAttendant/getJsonData.cmd");
		
		// 연결 설정
		HttpURLConnection conn = (HttpURLConnection) otpURL.openConnection();
		conn.setRequestMethod("POST");
		conn.setRequestProperty("referer", "http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201020101");
		conn.setDoOutput(true);
		
		// 오늘 연월일 : today
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyyMMdd");
		Date time = new Date();
		String today = format1.format(time);
		System.out.println(today);
		
		// 연결
		PrintStream ps = new PrintStream(conn.getOutputStream());
		ps.print(requestURL + today);
		ps.close();
		
//		 응답코드
//		int responseCode = conn.getResponseCode();
//		System.out.println("OTP ResponseCode : " + responseCode);
		
		// 데이터 수신
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
		StringBuffer sb = new StringBuffer();
		String inputLine;
		
		while((inputLine = br.readLine()) != null) {
			sb.append(inputLine);
		}
		br.close();
		conn.disconnect();
		
		String result = sb.toString();
		
q
		return stockList;

	}


}