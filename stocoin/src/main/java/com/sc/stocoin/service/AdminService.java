package com.sc.stocoin.service;

import java.io.IOException;

import com.sc.stocoin.model.Admin;

public interface AdminService {

	public Admin select(String id);

	public void memberOut(String id) throws IOException;
	
}
