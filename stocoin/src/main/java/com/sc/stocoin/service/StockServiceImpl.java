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
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sc.stocoin.model.StocoinStrings;

@Service
public class StockServiceImpl implements StockService {
	private List<Map<String, Object>> stockLists;
	private List<Map<String, Object>> stockCodes;
	private Map<String, String> corpCodes;

	@Override
	public List<Map<String, Object>> getStockList() throws IOException {
		// 연결 URL 설정
		String requestURL = "bld=dbms/MDC/STAT/standard/MDCSTAT01501&mktId=ALL&share=1&money=1&csvxls_isNo=false&trdDd=";
		URL otpURL = new URL("http://data.krx.co.kr/comm/bldAttendant/getJsonData.cmd");

		// 연결 설정
		HttpURLConnection conn = (HttpURLConnection) otpURL.openConnection();
		conn.setRequestMethod("POST");
		conn.setRequestProperty("referer",
				"http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201020101");
		conn.setDoOutput(true);

		// 오늘 연월일 : today
		SimpleDateFormat format1 = new SimpleDateFormat("yyyyMMdd");
		Date time = new Date();
		// 24시 부터 09시까지는 전날로 계산
		Calendar cal = Calendar.getInstance();
		cal.setTime(time);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		if (hour < 9)
			cal.add(Calendar.DATE, -1);
		// 주말은 금요일로 계산
		int week = cal.get(Calendar.DAY_OF_WEEK);
		if (week == 1) // 일요일
			cal.add(Calendar.DATE, -2);
		else if (week == 7) // 토요일
			cal.add(Calendar.DATE, -1);

		time = cal.getTime();
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

		while ((inputLine = br.readLine()) != null) {
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
		Type mapTokenType = new TypeToken<Map<String, Object>>() {
		}.getType();

		// stock list
		List<Map<String, Object>> stockList = new ArrayList<>();

		for (int i = 0; i < array.size(); i++) {
			JsonObject object2 = (JsonObject) array.get(i);

			// object2에 있는 모든 요소를 한번에 담기
			Map<String, Object> map = new Gson().fromJson(object2, mapTokenType);
			stockList.add(map);
		}
		this.stockLists = stockList;

		// 종목 코드 받아오기
		requestURL = "bld=dbms/MDC/STAT/standard/MDCSTAT01901&mktId=ALL&share=1&csvxls_isNo=false";
		// 연결 설정
		conn = (HttpURLConnection) otpURL.openConnection();
		conn.setRequestMethod("POST");
		conn.setRequestProperty("referer",
				"http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201020101");
		conn.setDoOutput(true);
		// 연결
		ps = new PrintStream(conn.getOutputStream());
		ps.print(requestURL);
		ps.close();
		// 데이터 수신
		br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
		sb = new StringBuffer();
		inputLine = "";

		while ((inputLine = br.readLine()) != null) {
			sb.append(inputLine);
		}
		br.close();
		conn.disconnect();

		result = sb.toString();

		// JSON 파싱
		parser = new JsonParser();
		element = parser.parse(result);
		// JSONObject에 담기
		object = element.getAsJsonObject();
		// JSONArray에 담기
		array = (JsonArray) object.get("OutBlock_1");

		// stockCode
		List<Map<String, Object>> stockCode = new ArrayList<>();

		for (int i = 0; i < array.size(); i++) {
			JsonObject object2 = (JsonObject) array.get(i);

			// object2에 있는 모든 요소를 한번에 담기
			Map<String, Object> map = new Gson().fromJson(object2, mapTokenType);
			stockCode.add(map);
		}
		this.stockCodes = stockCode;
		// 종목코드 종료

		// 종목코드 - 회사코드
		corpCodes = new HashMap<String, String>();
		StocoinStrings ss = new StocoinStrings();
		String corpCode = ss.getCORPCODE();

		parser = new JsonParser();
		element = parser.parse(corpCode);
		object = element.getAsJsonObject();

		array = (JsonArray) object.get("list");
		for (int i = 0; i < array.size(); i++) {
			JsonObject object2 = (JsonObject) array.get(i);
			corpCodes.put(object2.get("stock_code").getAsString(), object2.get("corp_code").getAsString());
		}
		// 종목코드 - 회사코드 종료
		return stockList;
	}

	@Override
	public List<Map<String, Object>> stockListSort(String kind, String sort, List<Map<String, Object>> stockList) {
		// sort : stockList가 String이면 sort error
		Collections.sort(stockList, new Comparator<Map<String, Object>>() {
			@Override
			public int compare(Map<String, Object> o1, Map<String, Object> o2) {
				if (sort.equals("asc")) {
					if (kind.equals("ISU_ABBRV")) { // 종목명
						String name1 = (String) o1.get(kind);
						String name2 = (String) o2.get(kind);
						return name1.compareTo(name2);
					} else {
						String str = o1.get(kind).toString().replaceAll(",", "");
						String str2 = o2.get(kind).toString().replaceAll(",", "");
						Float name1 = Float.parseFloat(str);
						Float name2 = Float.parseFloat(str2);
						return name1.compareTo(name2);
					}
				} else {
					if (kind.equals("ISU_ABBRV")) {
						String name1 = (String) o1.get(kind);
						String name2 = (String) o2.get(kind);
						return name2.compareTo(name1);
					} else {
						String str = o1.get(kind).toString().replaceAll(",", "");
						String str2 = o2.get(kind).toString().replaceAll(",", "");
						Float name1 = Float.parseFloat(str);
						Float name2 = Float.parseFloat(str2);
						return name2.compareTo(name1);
					}
				}
			}
		});
		return stockList;
	}

	@Override
	public Map<String, Object> getStockInfo(String code) throws IOException, ParseException{
		// 해당 이름에 대한 stock 정보를 담을 map 생성
		Map<String, Object> stockInfo = new HashMap<>();
		
		if (stockLists == null) {
			getStockList();
		}
		
		for (int i = 0; i < stockLists.size(); i++) {
			String codes = (String) stockLists.get(i).get("ISU_SRT_CD");

			// 해당 코드가 있는 map을 찾음
			if (codes.equals(code)) {
				String trade_price = ((String) stockLists.get(i).get("ACC_TRDVAL")).replaceAll(",", "");
				stockInfo = stockLists.get(i);
				// 거래 금액 콤마 제거하여 담기
				stockInfo.put("trade_price", trade_price);
				// 회사 코드 찾아서 넣기
				stockInfo.put("corp_code", corpCodes.get(codes));
				break;
			}
		}
		return stockInfo;
	}

	@Override
	public String getChart(String code, String time) throws IOException {
		// 종목 코드 검색
		String isuCode = "";
		for (int i = 0; i < stockCodes.size(); i++) {
			String codes = (String) stockCodes.get(i).get("ISU_SRT_CD");

			// 해당 코드가 있는 map을 찾음
			if (codes.equals(code)) {
				isuCode = (String) stockCodes.get(i).get("ISU_CD");
				break;
			}
		}
		// 연결 URL 설정
		String requestURL;
		// 일간 차트
		if (time.equals("1d"))
			requestURL = "bld=dbms/MDC/STAT/standard/MDCSTAT02106&ddTp=1M&isuCd=" + isuCode
					+ "&isuCd2=&param1isuCd_finder_stkisu0_0=ALL&csvxls_isNo=false";
		// 일일 차트
		else
			requestURL = "bld=dbms/MDC/STAT/standard/MDCSTAT02105&isuCd=" + isuCode
					+ "&isuCd2=&param1isuCd_finder_stkisu0_0=ALL&csvxls_isNo=false";
		URL otpURL = new URL("http://data.krx.co.kr/comm/bldAttendant/getJsonData.cmd");

		// 연결 설정
		HttpURLConnection conn = (HttpURLConnection) otpURL.openConnection();
		conn.setRequestMethod("POST");
		conn.setRequestProperty("referer",
				"http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201020101");
		conn.setDoOutput(true);

		// 연결
		PrintStream ps = new PrintStream(conn.getOutputStream());
		ps.print(requestURL);
		ps.close();

//				 응답코드
//				int responseCode = conn.getResponseCode();
//				System.out.println("OTP ResponseCode : " + responseCode);

		// 데이터 수신
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
		StringBuffer sb = new StringBuffer();
		String inputLine;

		while ((inputLine = br.readLine()) != null) {
			sb.append(inputLine);
		}
		br.close();
		conn.disconnect();

		String result = sb.toString();
		return result;
	}

	@Override
	public List<Map<String, Object>> getFinancialStatement(String code, String year) throws IOException {
		String reqURL = "https://opendart.fss.or.kr/api/fnlttSinglAcntAll.json?crtfc_key=a248d130cedcab6227310f848b1b5bb297bc4ed1&corp_code="
				+ code + "&bsns_year=" + year + "&reprt_code=11011&fs_div=OFS";

		URL url = new URL(reqURL);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();

		// 요청을 통해 얻은 JSON타입의 Response 메세지 읽어오기
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
		String line = "";
		String result = "";

		while ((line = br.readLine()) != null) {
			result += line;
		}

		// JSON 파싱
		JsonParser parser = new JsonParser();
		JsonElement element = parser.parse(result);
		// JSONObject에 담기
		JsonObject object = element.getAsJsonObject();
		// JSONArray에 담기
		JsonArray array = (JsonArray) object.get("list");

		// 형식 지정 : map으로 쓰겠다
		Type mapTokenType = new TypeToken<Map<String, Object>>() {
		}.getType();

		// stock list
		List<Map<String, Object>> fs = new ArrayList<>();

		for (int i = 0; i < array.size(); i++) {
			JsonObject object2 = (JsonObject) array.get(i);

			// object2에 있는 모든 요소를 한번에 담기
			Map<String, Object> map = new Gson().fromJson(object2, mapTokenType);
			fs.add(map);
		}
		return fs;
	}
	
	@Override
	public List<Map<String, Object>> getStockSearch(String search, List<Map<String, Object>> stockList) {
		// 해당 이름에 대한 stock 정보를 담을 map 생성
		List<Map<String, Object>> stockSearch = new ArrayList<>();
		
		for (int i = 0; i < stockList.size(); i++) {
			String sname = ((String) stockList.get(i).get("ISU_ABBRV")).toUpperCase();
			
			// 해당 검색결과가 있는 map을 찾아서 리스트 생성
			if (sname.contains(search.toUpperCase())) {
				stockSearch.add(stockList.get(i));
			}
		}
		
		return stockSearch;
	}

	
}
