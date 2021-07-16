package com.sc.stocoin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.stocoin.dao.ReplyLikesDao;
import com.sc.stocoin.model.ReplyLikes;

@Service
public class ReplyLikesServiceImpl implements ReplyLikesService {
	@Autowired
	private ReplyLikesDao rld;

	@Override
	public void insertLikes(ReplyLikes rl) {
		rld.insertLikes(rl);
	}

	@Override
	public ReplyLikes select(ReplyLikes rl) {
		return rld.select(rl);
	}

	@Override
	public void deleteLikes(ReplyLikes rl) {
		rld.deleteLikes(rl);
	}

	@Override
	public List<ReplyLikes> selectMno(int mno, int bno) {
		return rld.selectMno(mno, bno);
	}
}
