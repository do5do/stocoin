package com.sc.stocoin.service;

import com.sc.stocoin.model.QnaReply;

public interface QnaReplyService {

	QnaReply select(int qno);

	int insert(QnaReply qr);

}
