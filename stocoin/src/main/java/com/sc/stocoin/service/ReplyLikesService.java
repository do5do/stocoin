package com.sc.stocoin.service;

import java.util.List;

import com.sc.stocoin.model.ReplyLikes;

public interface ReplyLikesService {

	void insertLikes(ReplyLikes rl);

	ReplyLikes select(ReplyLikes rl);

	void deleteLikes(ReplyLikes rl);

	List<ReplyLikes> selectMno(int mno, int bno);

}
