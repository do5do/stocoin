package com.sc.stocoin.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Timestamp;
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

import com.google.gson.JsonArray;
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
			String price = data.getAsJsonObject().get(att.getKey()).getAsJsonObject().get("closing_price")
					.getAsString();
			coin.put("price", price);
			coin.put("name", att.getKey());

			coinList.add(coin);
		}

		br.close();

		return coinList;

	}

	// 각 코인의 등락률 계산 메서드
	public List<Map<String, String>> getFluctuation_Rate() throws IOException, ParseException {
		List<Map<String, String>> fluctuaion_rate = new ArrayList<Map<String, String>>();
		
		for (int i = 0; i < 177; i++) {
			// 가져올 api 주소 연결                                          코인명     
			String reqURL2 = "https://api.bithumb.com/public/candlestick/" + getCoinInfo().get(i).get("name") + "_KRW/5m";
			URL url2 = new URL(reqURL2);
			HttpURLConnection conn2 = (HttpURLConnection) url2.openConnection();
			conn2.setRequestMethod("POST");
			
			// 요청을 통해 얻은 JSON타입의 Response 메세지 읽어오기
			BufferedReader br2 = new BufferedReader(new InputStreamReader(conn2.getInputStream()));
			String line2 = "";
			String result2 = "";
			
			while ((line2 = br2.readLine()) != null) {
				result2 += line2;
			}
			
			// JSON파싱 객체 생성
			JsonParser parser2 = new JsonParser();
			JsonElement element2 = parser2.parse(result2);
			JsonArray data2 = element2.getAsJsonObject().get("data").getAsJsonArray();
			
			// 기준시간(오늘 날짜 기준 00시)
			String standard_time = String.valueOf(getTimeStamp());
			
			for (int j = 0; j < data2.size(); j++) {
				Map<String, String> coin = new HashMap<String, String>();
				
				// 배열에서 시간에 해당하는 부분 파싱
				String time = data2.getAsJsonArray().get(j).getAsJsonArray().get(0).getAsString();
				// 시간 중 standard_time과 일치하면
				if (time.equals(standard_time)) {
					float now_price = Float.parseFloat(getCoinInfo().get(i).get("price"));
					float standard_price = data2.getAsJsonArray().get(j).getAsJsonArray().get(2).getAsFloat();
					float fluctuation =  now_price - standard_price;
					String fluctuation_rates = String.format("%,.2f", fluctuation/now_price);
					coin.put("fluctuation_rates", fluctuation_rates);
					coin.put("name", getCoinInfo().get(i).get("name"));

					fluctuaion_rate.add(coin);
				}
			}
		}
		System.out.println("fluctuaion_rate >>> " + fluctuaion_rate);
		
		return fluctuaion_rate;
	}

	// 기준 시간 가져오는 메서드
	public long getTimeStamp() throws ParseException {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = sdf.format(timestamp) + " 09:00:00";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date = sdf2.parse(dateString);
		long standard_time = date.getTime();

		return standard_time;
	}

	// 차트 가져올때 사용할 메서드
/*	@Override
	public List<String> getChartList(List<Map<String, String>> coinList) throws IOException {
		// 가져올 api 주소 연결
		String reqURL = "https://api.bithumb.com/public/candlestick/" + coinList.get("name") + "_KRW/5m";
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
