package com.sc.stocoin.dao;

import com.sc.stocoin.model.QnaReply;

public interface QnaReplyDao {

	QnaReply select(int qno);

	int insert(QnaReply qr);

}
