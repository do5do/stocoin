package com.sc.stocoin.service;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.stocoin.dao.AdminDao;
import com.sc.stocoin.model.Admin;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminDao ad;

	@Override
	public Admin select(String id) {
		return ad.select(id);
	}

	@Override
	public void memberOut(String id) throws IOException {
		String reqURL = "https://kapi.kakao.com/v1/user/unlink";
		URL url = new URL(reqURL);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("POST");
		conn.setDoOutput(true);
		conn.setRequestProperty("Authorization", "KakaoAK 8358d73166c62f376f317bf6e4193fdc");

		// POST 요청에 필요로 요구하는 파라미터 스트림을 통해 전송
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
		StringBuilder sb = new StringBuilder();
		sb.append("target_id_type=user_id");
		sb.append("&target_id=" + id);
		bw.write(sb.toString());
		bw.flush();

		conn.getResponseCode();

		ad.deleteList(id);
	}
}
