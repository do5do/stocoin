package com.sc.stocoin.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sc.stocoin.model.Board;

@Repository
public class BoardDaoImpl implements BoardDao {
	@Autowired
	private SqlSessionTemplate sst;

	@Override
	public int insert(Board board) {
		return sst.insert("boardns.insert", board);
	}

	@Override
	public List<Board> boardList() {
		return sst.selectList("boardns.boardList");
	}
}
