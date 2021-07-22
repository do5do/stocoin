package com.sc.stocoin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.stocoin.dao.QnaDao;
import com.sc.stocoin.model.Qna;

@Service
public class QnaServiceImpl implements QnaService {
	@Autowired
	private QnaDao qd;

	@Override
	public List<Qna> qaList(Qna qna) {
		return qd.qaList(qna);
	}

	@Override
	public int insert(Qna qna) {
		return qd.insert(qna);
	}

	@Override
	public int getTotal() {
		return qd.getTotal();
	}

	@Override
	public Qna select(int qno) {
		return qd.select(qno);
	}
}
