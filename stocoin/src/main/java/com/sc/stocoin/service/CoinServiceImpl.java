package com.sc.stocoin.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sc.stocoin.dao.CoinDao;

@Service
public class CoinServiceImpl implements CoinService {
	@Autowired
	private CoinDao cd;

	@Override
	public List<Map<String, Object>> getCoinList(String kind, String sort) throws IOException, ParseException {
		// 가져올 api 주소 연결
		String reqURL = "https://api.bithumb.com/public/ticker/ALL";
		URL url = new URL(reqURL);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("POST");

		// 요청을 통해 얻은 JSON타입의 Response 메세지 읽어오기
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String line = "";
		String result = "";

		while ((line = br.readLine()) != null) {
			result += line;
		}

		// JSON파싱 객체 생성
		JsonParser parser = new JsonParser();
		JsonElement element = parser.parse(result);

		// data 키에 들어있는 코인 정보
		JsonObject data = element.getAsJsonObject().get("data").getAsJsonObject();

		// data의 key와 value 담을 map 세팅
		Map<String, Object> attributes = new HashMap<String, Object>();

		// data를 entry에 담기
		Set<Entry<String, JsonElement>> entrySet = data.entrySet();

		// map에 data entry 담기
		for (Map.Entry<String, JsonElement> entry : entrySet) {
			attributes.put(entry.getKey(), data.get(entry.getKey()));
		}

		// date는 string이어서 not object 에러남 => 제거
		attributes.remove("date");

		// 코인 정보 담을 list 세팅
		List<Map<String, Object>> coinList = new ArrayList<Map<String, Object>>();

		// map에 있는 key이름을 list에 담기
		for (Map.Entry<String, Object> att : attributes.entrySet()) {
			Map<String, Object> coin = new HashMap<String, Object>();
			float price = data.getAsJsonObject().get(att.getKey()).getAsJsonObject().get("closing_price").getAsFloat();
			float fluctuation_rate = data.getAsJsonObject().get(att.getKey()).getAsJsonObject().get("fluctate_rate_24H")
					.getAsFloat();
			float trade_value = data.getAsJsonObject().get(att.getKey()).getAsJsonObject().get("acc_trade_value_24H")
					.getAsFloat();

			coin.put("trade_value", trade_value / 1000000);
			coin.put("fluctuation_rate", fluctuation_rate);
			coin.put("price", price);
			coin.put("name", att.getKey());

			coinList.add(coin);
		}

		// 정렬
		Collections.sort(coinList, new Comparator<Map<String, Object>>() {
			@Override
			public int compare(Map<String, Object> o1, Map<String, Object> o2) {
				if (sort.equals("asc")) { // 오름차순
					if (kind.equals("name")) {
						String name1 = (String) o1.get(kind);
						String name2 = (String) o2.get(kind);
						return name1.compareTo(name2);

					} else {
						Float name1 = (float) o1.get(kind);
						Float name2 = (float) o2.get(kind);
						return name1.compareTo(name2);
					}
				} else { // 내림차순
					if (kind.equals("name")) {
						String name1 = (String) o1.get(kind);
						String name2 = (String) o2.get(kind);
						return name2.compareTo(name1);

					} else {
						Float name1 = (float) o1.get(kind);
						Float name2 = (float) o2.get(kind);
						return name2.compareTo(name1);
					}
				}
			}
		});

		br.close();

		return coinList;

	}

	@Override
	public Map<String, String> getCoinInfo(String name) throws IOException {
		// 가져올 api 주소 연결
		String reqURL = "https://api.bithumb.com/public/ticker/ALL";
		URL url = new URL(reqURL);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("POST");
				
		// 요청을 통해 얻은 JSON타입의 Response 메세지 읽어오기
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String line = "";
		String result = "";

		while ((line = br.readLine()) != null) {
			result += line;
		}

		// JSON파싱 객체 생성
		JsonParser parser = new JsonParser();
		JsonElement element = parser.parse(result);

		// data 키에 들어있는 코인 정보
		JsonObject data = element.getAsJsonObject().get("data").getAsJsonObject();
		JsonObject coin = data.getAsJsonObject().get(name).getAsJsonObject();
		
		@SuppressWarnings("serial")
		Type mapTokenType = new TypeToken<Map<String, String>>(){}.getType();

        Map<String, String> coinInfo = new Gson().fromJson(coin, mapTokenType);
				
		return coinInfo;
	}

//	 차트 가져올때 사용할 메서드
	/*
	 * @Override public List<String> getChartList(List<Map<String, String>>
	 * coinList) throws IOException { // 가져올 api 주소 연결 String reqURL =
	 * "https://api.bithumb.com/public/candlestick/" + coinList + "_KRW/5m"; URL url
	 * = new URL(reqURL); HttpURLConnection conn = (HttpURLConnection)
	 * url.openConnection(); conn.setRequestMethod("POST");
	 * 
	 * // 요청을 통해 얻은 JSON타입의 Response 메세지 읽어오기 BufferedReader br = new
	 * BufferedReader(new InputStreamReader(conn.getInputStream())); String line =
	 * ""; String result = "";
	 * 
	 * while ((line = br.readLine()) != null) { result += line; }
	 * 
	 * // JSON파싱 객체 생성 JsonParser parser = new JsonParser();
	 * 
	 * JsonElement element = parser.parse(result); // data 키에 들어있는 코인 정보 JsonObject
	 * data = (JsonObject) element.getAsJsonObject().get("data");
	 * 
	 * List<String> list = new ArrayList<String>();
	 * 
	 * return list; }
	 */
}
