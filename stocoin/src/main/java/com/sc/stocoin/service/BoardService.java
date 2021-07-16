package com.sc.stocoin.service;

import java.util.List;

import com.sc.stocoin.model.Board;

public interface BoardService {

	int insert(Board board);

	List<Board> boardList();

	Board select(int bno);

	void updateViews(int bno);

	int update(Board board);

}
