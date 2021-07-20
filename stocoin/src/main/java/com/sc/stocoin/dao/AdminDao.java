package com.sc.stocoin.dao;

import com.sc.stocoin.model.Admin;

public interface AdminDao {

	Admin select(String id);

	void deleteList(String id);

}
