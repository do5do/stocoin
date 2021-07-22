package com.sc.stocoin.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sc.stocoin.model.QnaReply;

@Repository
public class QnaReplyDaoImpl implements QnaReplyDao {
	@Autowired
	private SqlSessionTemplate sst;

	@Override
	public QnaReply select(int qno) {
		return sst.selectOne("qnareplyns.select", qno);
	}

	@Override
	public int insert(QnaReply qr) {
		return sst.insert("qnareplyns.insert", qr);
	}
}
