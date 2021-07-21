package com.sc.stocoin.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
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
import com.sc.stocoin.dao.CoinDao;

@Service
public class CoinServiceImpl implements CoinService {
	@Autowired
	private CoinDao cd;

	@Override
	public List<Map<String, String>> getCoinInfo() throws IOException, ParseException {
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

		// 코인 이름 담을 list 세팅
		List<Map<String, String>> coinList = new ArrayList<Map<String, String>>();

		// map에 있는 key이름을 list에 담기
		for (Map.Entry<String, Object> att : attributes.entrySet()) {
			Map<String, String> coin = new HashMap<String, String>();
			float price = data.getAsJsonObject().get(att.getKey()).getAsJsonObject().get("closing_price").getAsFloat();
			float fluctuation_rate = data.getAsJsonObject().get(att.getKey()).getAsJsonObject().get("fluctate_rate_24H").getAsFloat();
			coin.put("fluctuation_rate",  String.valueOf(fluctuation_rate));
			coin.put("price", String.format("%,.1f", price));
			coin.put("name", att.getKey());

			coinList.add(coin);
		}

		br.close();

		return coinList;

	}


	// 차트 가져올때 사용할 메서드
/*	@Override
	public List<String> getChartList(List<Map<String, String>> coinList) throws IOException {
		// 가져올 api 주소 연결
		String reqURL = "https://api.bithumb.com/public/candlestick/" + coinList + "_KRW/5m";
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
		JsonObject data = (JsonObject) element.getAsJsonObject().get("data");

		List<String> list = new ArrayList<String>();

		return list;
	}
*/
}
