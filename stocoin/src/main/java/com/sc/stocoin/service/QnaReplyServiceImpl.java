package com.sc.stocoin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.stocoin.dao.QnaReplyDao;
import com.sc.stocoin.model.QnaReply;

@Service
public class QnaReplyServiceImpl implements QnaReplyService {
	@Autowired
	private QnaReplyDao qrd;

	@Override
	public QnaReply select(int qno) {
		return qrd.select(qno);
	}

	@Override
	public int insert(QnaReply qr) {
		return qrd.insert(qr);
	}
}
