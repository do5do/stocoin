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

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sc.stocoin.dao.FavoriteCoinDao;
import com.sc.stocoin.dao.TradeCoinDao;
import com.sc.stocoin.model.Coin;
import com.sc.stocoin.model.FavoriteCoin;
import com.sc.stocoin.model.MyCoin;

@Service
public class CoinServiceImpl implements CoinService {
	@Autowired
	private TradeCoinDao tcd;

	@Autowired
	private FavoriteCoinDao fcd;

	private List<Map<String, Object>> coinLists;

	@Override
	public List<Map<String, Object>> initialCoinList(HttpSession session) throws IOException {
		// 코인 리스트 가져와서 저장
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
		
		Coin c = new Coin();
		List<Map<String, String>> coinNameKo = c.getCoinNameKo();
		String cname_ko = null;
		
		 // map에 있는 key이름을 list에 담기
		for (Map.Entry<String, Object> att : attributes.entrySet()) {
			for (Map<String, String> cnk : coinNameKo) {
				if (cnk.get("en").equals(att.getKey())) {
					cname_ko = cnk.get("ko");
					break;
				}
			}
			Map<String, Object> coin = new HashMap<String, Object>();
			float price = data.getAsJsonObject().get(att.getKey()).getAsJsonObject().get("closing_price").getAsFloat();
			float fluctuation_rate = data.getAsJsonObject().get(att.getKey()).getAsJsonObject().get("fluctate_rate_24H")
					.getAsFloat();
			float trade_value = data.getAsJsonObject().get(att.getKey()).getAsJsonObject().get("acc_trade_value_24H")
					.getAsFloat();
			coin.put("star", "☆");
			coin.put("trade_value", trade_value / 1000000);
			coin.put("fluctuation_rate", fluctuation_rate);
			coin.put("price", price);
			coin.put("name", att.getKey());
			coin.put("cname_ko", cname_ko);

			coinList.add(coin);
		}
		int mno = -1;
		try {
			mno = (int) session.getAttribute("mno");
		} catch (Exception e) {
		}
		if(mno > 0) {
			List<FavoriteCoin> favoriteCoinName = fcd.favoriteCoinName(mno);
			for (int i = 0; i < favoriteCoinName.size(); i++) {
				// 전체 코인목록에서
				for(int j = 0; j < coinList.size(); j++) {
					// 일치하는 코인만 추가
					if(coinList.get(j).containsValue(favoriteCoinName.get(i))) {
						coinList.get(j).put("star", "★");
						break;
					}
				}
			}
		}
		br.close();

		coinLists = coinList;
		return coinList;
	}

	@Override
	public List<Map<String, Object>> getCoinList(String kind, String sort, String coin_tab, String val,
			HttpSession session) throws IOException, ParseException {
		// 코인 리스트 생성
		List<Map<String, Object>> coinList = new ArrayList<Map<String, Object>>();
		// 전체 코인 리스트
		if (coin_tab.equals("all")) {
			if(val == null || val.equals("")) {
				coinList = coinLists;
			} else {
				for(int i = 0; i < coinLists.size(); i++) {
					if(coinLists.get(i).get("name").toString().contains(val.toUpperCase()) || coinLists.get(i).get("cname_ko").toString().contains(val))
						coinList.add(coinLists.get(i));
				}
			}
		// 내 코인 탭	
		} else if(coin_tab.equals("my")) {
			int mno = (int) session.getAttribute("mno");
			List<MyCoin> myCoinName = tcd.myCoinName(mno);
			for (int i = 0; i < myCoinName.size(); i++) {
				// 전체 코인목록에서
				for(int j = 0; j < coinLists.size(); j++) {
					// 일치하는 코인만 추가
					if(coinLists.get(j).containsValue(myCoinName.get(i))) {
						if(val == null || val.equals("")) {
							coinList.add(coinLists.get(j));
						} else {
							if(coinLists.get(j).get("name").toString().contains(val.toUpperCase()) || coinLists.get(i).get("cname_ko").toString().contains(val))
								coinList.add(coinLists.get(j));
						}
						break;
					}
				}
			}
		// 즐겨찾기 탭
		} else if (coin_tab.equals("favorite")) {
			int mno = (int) session.getAttribute("mno");
			List<FavoriteCoin> favoriteCoinName = fcd.favoriteCoinName(mno);
			for (int i = 0; i < favoriteCoinName.size(); i++) {
				// 전체 코인목록에서
				for(int j = 0; j < coinLists.size(); j++) {
					// 일치하는 코인만 추가
					if(coinLists.get(j).containsValue(favoriteCoinName.get(i))) {
						if(val == null || val.equals("")) {
							coinList.add(coinLists.get(j));
						} else {
							if(coinLists.get(j).get("name").toString().contains(val.toUpperCase()) || coinLists.get(i).get("cname_ko").toString().contains(val))
								coinList.add(coinLists.get(j));
						}
						break;
					}
				}
			}
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
		return coinList;
	}

	@Override
	public Map<String, String> getCoinInfo(String name) throws IOException {
		// 가져올 api 주소 연결
		String reqURL = "https://api.bithumb.com/public/ticker/" + name;
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
//		JsonObject coin = data.getAsJsonObject().get(name).getAsJsonObject();

		@SuppressWarnings("serial")
		Type mapTokenType = new TypeToken<Map<String, String>>() {
		}.getType();

		Map<String, String> coinInfo = new Gson().fromJson(data, mapTokenType);
		
		Coin c = new Coin();
		List<Map<String, String>> coinNameKo = c.getCoinNameKo();
		String cname_ko = null;
		for (Map<String, String> cnk : coinNameKo) {
			if (cnk.get("en").equals(name)) {
				cname_ko = cnk.get("ko");
				break;
			}
		}

		coinInfo.put("cname_ko", cname_ko);

		return coinInfo;
	}

	@Override
	public void changeCoinStar(String name) {
		// TODO Auto-generated method stub
		for(int j = 0; j < coinLists.size(); j++) {
			// 일치하는 코인만 추가
			if(coinLists.get(j).containsValue(name)) {
				if(coinLists.get(j).get("star") == "☆")
					coinLists.get(j).put("star", "★");
				else
					coinLists.get(j).put("star", "☆");
				break;
			}
		}
	}

}
