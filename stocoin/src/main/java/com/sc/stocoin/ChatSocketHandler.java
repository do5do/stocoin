package com.sc.stocoin;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;
public class ChatSocketHandler extends TextWebSocketHandler{
	// 접속한 클라이언트의 Session을 저장할 객체
	private Map<String, WebSocketSession> users = 
			new HashMap<String, WebSocketSession>();
	// 연결 됐을 때 : 연결된 정보(클라이언트)를 map 저장
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		users.put(session.getId(), session);
	}
	// 연결을 해지 했을 때 : 연결된 정보를 삭제
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		users.remove(session.getId());
	}
	// 메세지가 왔을 때 : 연결된 모든 클라이언트 메세지를 전송
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		Collection<WebSocketSession> sessions = users.values();
		for (WebSocketSession ws : sessions) {
			ws.sendMessage(message);
		}
	}
}