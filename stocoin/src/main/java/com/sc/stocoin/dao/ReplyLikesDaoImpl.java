package com.sc.stocoin.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sc.stocoin.model.ReplyLikes;

@Repository
public class ReplyLikesDaoImpl implements ReplyLikesDao {
	@Autowired
	private SqlSessionTemplate sst;

	@Override
	public void insertLikes(ReplyLikes rl) {
		sst.insert("replyLikesns.insertLikes", rl);
	}

	@Override
	public ReplyLikes select(ReplyLikes rl) {
		return sst.selectOne("replyLikesns.select", rl);
	}

	@Override
	public void deleteLikes(ReplyLikes rl) {
		sst.delete("replyLikesns.delete", rl);
	}

	@Override
	public List<ReplyLikes> selectMno(int mno, int bno) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("mno", mno);
		hm.put("bno", bno);
		return sst.selectList("replyLikesns.selectMno", hm);
	}
}
