package com.sc.stocoin.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sc.stocoin.dao.StockDao;

@Service
public class StockServiceImpl implements StockService {
	@Autowired
	private StockDao cd;
	
	private List<Map<String, Object>> stockLists;

	@Override
	public List<Map<String, Object>> getStockList() throws IOException, ParseException {
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
		
		// JSON 파싱
		JsonParser parser = new JsonParser();
		JsonElement element = parser.parse(result);
		// JSONObject에 담기
		JsonObject object = element.getAsJsonObject();
		// JSONArray에 담기
		JsonArray array = (JsonArray) object.get("OutBlock_1");
		
		// 형식 지정 : map으로 쓰겠다
		Type mapTokenType = new TypeToken<Map<String, Object>>(){}.getType();
		
		// stock list
		List<Map<String, Object>> stockList = new ArrayList<>();
		
		for (int i = 0; i < array.size(); i++) {
			JsonObject object2 = (JsonObject) array.get(i);
			
			// object2에 있는 모든 요소를 한번에 담기
			Map<String, Object> map = new Gson().fromJson(object2, mapTokenType);
			stockList.add(map);
		}
		this.stockLists = stockList;
		
		return stockList;
	}

	@Override
	public List<Map<String, Object>> stockListSort(String kind, String sort) {
		// sort : stockList가 String이면 sort error
		Collections.sort(stockLists, new Comparator<Map<String, Object>>() {
			@Override
			public int compare(Map<String, Object> o1, Map<String, Object> o2) {
				if (sort.equals("asc")) {
					if (kind.equals("FLUC_RT")) {
						Float name1 = Float.parseFloat((String) o1.get(kind));
						Float name2 = Float.parseFloat((String) o2.get(kind));
						return name1.compareTo(name2);

					} else {
						String name1 = (String) o1.get(kind);
						String name2 = (String) o2.get(kind);
						return name1.compareTo(name2);
						
					}
				} else {
					if (kind.equals("FLUC_RT")) {
						Float name1 = Float.parseFloat((String) o1.get(kind));
						Float name2 = Float.parseFloat((String) o2.get(kind));
						return name2.compareTo(name1);

					} else {
						String name1 = (String) o1.get(kind);
						String name2 = (String) o2.get(kind);
						return name2.compareTo(name1);
						
					}
				}
			}
		});
		return stockLists;
	}

	@Override
	public Map<String, Object> getStockInfo(String name) {
		// 해당 이름에 대한 stock 정보를 담을 map 생성
		Map<String, Object> stockInfo = new HashMap<>();

		for (int i = 0; i < stockLists.size(); i++) {
			String names = (String) stockLists.get(i).get("ISU_ABBRV");
			
			// 해당 이름이 있는 map을 찾음
			if (names.equals(name)) {
				stockInfo = stockLists.get(i);
			}
		}
		
		return stockInfo;
	}
}
