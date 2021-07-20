package com.sc.stocoin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.stocoin.dao.BoardDao;
import com.sc.stocoin.model.Board;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDao bd;

	@Override
	public int insert(Board board) {
		return bd.insert(board);
	}

	@Override
	public List<Board> boardList(Board board) {
		return bd.boardList(board);
	}

	@Override
	public Board select(int bno) {
		return bd.select(bno);
	}

	@Override
	public void updateViews(int bno) {
		bd.updateViews(bno);
	}

	@Override
	public int update(Board board) {
		return bd.update(board);
	}

	@Override
	public int delete(int bno) {
		return bd.delete(bno);
	}

	@Override
	public int getTotal(Board board) {
		return bd.getTotal(board);
	}
}
