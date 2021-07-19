package com.sc.stocoin.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sc.stocoin.model.Reply;
import com.sc.stocoin.model.ReplyLikes;

@Repository
public class ReplyDaoImpl implements ReplyDao {
	@Autowired
	private SqlSessionTemplate sst;

	@Override
	public void insert(Reply reply) {
		sst.insert("replyns.insert", reply);
	}

	@Override
	public List<Reply> replyList(Reply reply) {
		return sst.selectList("replyns.replyList", reply);
	}

	@Override
	public void update(Reply reply) {
		sst.update("replyns.update", reply);
	}

	@Override
	public void delete(Reply reply) {
		sst.update("replyns.delete", reply);
	}

	@Override
	public void updateLikes(Reply reply) {
		sst.update("replyns.updateLikes", reply);
	}

	@Override
	public int selectLikes(int rno, int mno) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("rno", rno);
		hm.put("mno", mno);
		return sst.selectOne("replyns.selectLikes", hm);
	}

	@Override
	public int getTotal(Reply reply) {
		return sst.selectOne("replyns.getTotal", reply);
	}
}
