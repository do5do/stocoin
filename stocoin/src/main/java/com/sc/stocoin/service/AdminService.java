package com.sc.stocoin.service;

import java.util.List;

import com.sc.stocoin.model.Admin;
import com.sc.stocoin.model.Member;

public interface AdminService {

	public Admin select(String id);

//	public List<Admin> listAdmin(String id);

	public List<Member> listMember(String id);
	
}
