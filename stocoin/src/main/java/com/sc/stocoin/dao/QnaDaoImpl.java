package com.sc.stocoin.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sc.stocoin.model.Qna;

@Repository
public class QnaDaoImpl implements QnaDao {
	@Autowired
	private SqlSessionTemplate sst;

	@Override
	public List<Qna> qaList(Qna qna) {
		return sst.selectList("qnans.qaList", qna);
	}

	@Override
	public int insert(Qna qna) {
		return sst.insert("qnans.insert", qna);
	}

	@Override
	public int getTotal() {
		return sst.selectOne("qnans.getTotal");
	}

	@Override
	public Qna select(int qno) {
		return sst.selectOne("qnans.select", qno);
	}

}
