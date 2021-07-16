package com.sc.stocoin.dao;

import java.util.List;

import com.sc.stocoin.model.Reply;
import com.sc.stocoin.model.ReplyLikes;

public interface ReplyDao {

	void insert(Reply reply);

	List<Reply> replyList(Reply reply);

	void update(Reply reply);

	void delete(Reply reply);

	void updateLikes(Reply reply);

	int selectLikes(int rno, int mno);

	int getTotal(Reply reply);

	
}
