package com.sc.stocoin.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sc.stocoin.dao.MemberDao;
import com.sc.stocoin.model.Member;
import com.sc.stocoin.model.StocoinStrings;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDao md;
	
	public String getAccessToken(String authorize_code) throws IOException {
		String reqURL = "https://kauth.kakao.com/oauth/token";
		URL url = new URL(reqURL);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();

		// POST 요청을 위해 기본값이 false인 setDoOutput을 true로
		conn.setRequestMethod("POST");
		conn.setDoOutput(true);

		StocoinStrings ss = new StocoinStrings();
		
		// POST 요청에 필요로 요구하는 파라미터 스트림을 통해 전송
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
		StringBuilder sb = new StringBuilder();
		sb.append("grant_type=authorization_code");
		sb.append("&client_id=8d7498ce8ee97c514f96feb042750e1e"); // 본인이 발급받은 key
		sb.append("&redirect_uri=http://" + ss.IP + "/stocoin/login"); // 본인이 설정해 놓은 경로
		sb.append("&code=" + authorize_code);
		bw.write(sb.toString());
		bw.flush();

		conn.getResponseCode();

		// 요청을 통해 얻은 JSON타입의 Response 메세지 읽어오기
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String line = "";
		String result = "";

		while ((line = br.readLine()) != null) {
			result += line;
		}

		// Gson 라이브러리에 포함된 클래스로 JSON파싱 객체 생성
		JsonParser parser = new JsonParser();
		JsonElement element = parser.parse(result);

		String access_Token = element.getAsJsonObject().get("access_token").getAsString();

		br.close();
		bw.close();

		return access_Token;
	}

	public HashMap<String, Object> getUserInfo(String access_Token) throws IOException {
		
		HashMap<String, Object> userInfo = new HashMap<String, Object>();
		String reqURL = "https://kapi.kakao.com/v2/user/me";
		URL url = new URL(reqURL);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		// 요청에 필요한 Header에 포함될 내용
		conn.setRequestProperty("Authorization", "Bearer " + access_Token);
		conn.getResponseCode();

		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));

		String line = "";
		String result = "";

		while ((line = br.readLine()) != null) {
			result += line;
		}

		JsonParser parser = new JsonParser();
		JsonElement element = parser.parse(result);

		String id = element.getAsJsonObject().get("id").getAsString();

		JsonObject properties = element.getAsJsonObject().get("properties").getAsJsonObject();
		String nick = properties.getAsJsonObject().get("nickname").getAsString();

		userInfo.put("id", id);
		userInfo.put("nick", nick);

		return userInfo;
	}

	public void delete(String access_Token, String id) throws IOException {
		String reqURL = "https://kapi.kakao.com/v1/user/unlink";
		URL url = new URL(reqURL);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Authorization", "Bearer " + access_Token);
		conn.getResponseCode();
		
		md.delete(id);
	}
	
	public Member select(String id) {
		return md.select(id);
	}
	
	public void insert(HashMap<String, Object> userInfo) {
		md.insert(userInfo);
	}

	public void updateDel(HashMap<String, Object> userInfo) {
		md.updateDel(userInfo);
	}

	public int update(Member member) {
		return md.update(member);
	}

	public List<Member> list(Member member) {
		return md.list(member);
	}

	@Override
	public int getTotal(Member member) {
		return md.getTotal(member);
	}

	@Override
	public List<Member> adminPage() {
		return md.adminPage();
	}

	@Override
	public Member selectNick(String nick) {
		return md.selectNick(nick);
	}

	@Override
	public void updateStockMoney(Member member) {
		md.updateStockMoney(member);
	}

	@Override
	public void updateCoinMoney(Member member) {
		md.updateCoinMoney(member);		
	}

	@Override
	public void updateAllStock() {
		md.updateAllStock();
	}

	@Override
	public void updateAllCoin() {
		md.updateAllCoin();
	}

	@Override
	public void resetMoney() {
		md.resetMoney();
	}
}
