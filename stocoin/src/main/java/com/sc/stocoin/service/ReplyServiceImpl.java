package com.sc.stocoin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.stocoin.dao.ReplyDao;
import com.sc.stocoin.model.Reply;
import com.sc.stocoin.model.ReplyLikes;

@Service
public class ReplyServiceImpl implements ReplyService {
	@Autowired
	private ReplyDao rd;

	@Override
	public void insert(Reply reply) {
		rd.insert(reply);
	}

	@Override
	public List<Reply> replyList(Reply reply) {
		return rd.replyList(reply);
	}

	@Override
	public void update(Reply reply) {
		rd.update(reply);
	}

	@Override
	public void delete(Reply reply) {
		rd.delete(reply);
	}

	@Override
	public void updateLikes(Reply reply) {
		rd.updateLikes(reply);
	}

	@Override
	public int selectLikes(int rno, int mno) {
		return rd.selectLikes(rno, mno);
	}

	@Override
	public int getTotal(Reply reply) {
		return rd.getTotal(reply);
	}
}
