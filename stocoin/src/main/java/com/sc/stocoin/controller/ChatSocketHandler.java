package com.sc.stocoin.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.sc.stocoin.dao.ChatDao;
import com.sc.stocoin.model.Chat;
public class ChatSocketHandler extends TextWebSocketHandler{
	@Autowired
	private ChatDao cd;
	private Map<String, WebSocketSession> users = 
			new HashMap<String, WebSocketSession>();
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		// 접속
		users.put(session.getId(), session);
		// 최근 채팅 기록 불러오기
		List<Chat> history = cd.select();
		for(Chat chat : history) {
			TextMessage message = new TextMessage(chat.getNick() + " : " + chat.getContent());
			session.sendMessage(message);
		}
	}
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		users.remove(session.getId());
	}
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		// DB에 저장
		String text = message.getPayload();
		String nick = text.substring(0, text.indexOf(":") - 1);
		String content = text.substring(text.indexOf(":") + 2);
		Chat chat = new Chat();
		chat.setNick(nick);
		chat.setContent(content);
		cd.insert(chat);
		// 채팅 메시지 보내짐
		Collection<WebSocketSession> sessions = users.values();
		for (WebSocketSession ws : sessions) {
			ws.sendMessage(message);
		}
	}
}