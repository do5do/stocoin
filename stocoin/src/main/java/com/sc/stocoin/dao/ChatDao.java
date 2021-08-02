package com.sc.stocoin.dao;

import java.util.List;

import com.sc.stocoin.model.Chat;

public interface ChatDao {

	List<Chat> select();
	int insert(Chat chat);
}
