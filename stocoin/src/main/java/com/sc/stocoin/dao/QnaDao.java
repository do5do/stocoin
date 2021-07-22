package com.sc.stocoin.dao;

import java.util.List;

import com.sc.stocoin.model.Qna;

public interface QnaDao {

	List<Qna> qaList(Qna qna);

	int insert(Qna qna);

	int getTotal();

	Qna select(int qno);

}
