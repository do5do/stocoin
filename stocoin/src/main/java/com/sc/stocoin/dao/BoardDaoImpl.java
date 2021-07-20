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
	public List<Board> boardList(Board board) {
		return sst.selectList("boardns.boardList", board);
	}

	@Override
	public Board select(int bno) {
		return sst.selectOne("boardns.select", bno);
	}

	@Override
	public void updateViews(int bno) {
		sst.update("boardns.updateVeiws", bno);
	}

	@Override
	public int update(Board board) {
		return sst.update("boardns.update", board);
	}

	@Override
	public int delete(int bno) {
		return sst.update("boardns.delete", bno);
	}

	@Override
	public int getTotal(Board board) {
		return sst.selectOne("boardns.getTotal", board);
	}
}
