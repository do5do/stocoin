package com.sc.stocoin.service;

import java.util.List;

import com.sc.stocoin.model.Qna;

public interface QnaService {

	List<Qna> qaList(Qna qna);

	int insert(Qna qna);

	int getTotal();

	Qna select(int qno);

}
