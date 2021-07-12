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
	public List<Board> boardList() {
		return bd.boardList();
	}
}
