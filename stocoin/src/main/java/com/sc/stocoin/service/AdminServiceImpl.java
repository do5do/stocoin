package com.sc.stocoin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.stocoin.dao.AdminDao;
import com.sc.stocoin.dao.MemberDao;
import com.sc.stocoin.model.Admin;
import com.sc.stocoin.model.Member;

@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	private AdminDao ad;
	@Autowired
	private MemberDao md;
	@Override
	public Admin select(String id) {
		return ad.select(id);
	}

//	@SuppressWarnings("unchecked")
//	@Override
//	public List<Admin> listAdmin(String id) {
//		return (List<Admin>) ad.select(id);
//	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Member> listMember(String id) {
		return (List<Member>) md.select(id);
	}

}
