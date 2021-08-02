package com.sc.stocoin.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sc.stocoin.model.Chat;
@Repository
public class ChatDaoImpl implements ChatDao{
	@Autowired
	private SqlSessionTemplate sst;
	@Override
	public List<Chat> select() {
		return sst.selectList("chatns.chatHistory");
	}

	@Override
	public int insert(Chat chat) {
		return sst.insert("chatns.insert", chat);
	}
}
