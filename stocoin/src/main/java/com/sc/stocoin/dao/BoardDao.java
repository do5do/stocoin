package com.sc.stocoin.dao;

import java.util.List;

import com.sc.stocoin.model.Board;

public interface BoardDao {

	int insert(Board board);

	List<Board> boardList(Board board);

	Board select(int bno);

	void updateViews(int bno);

	int update(Board board);

	int delete(int bno);

	int getTotal(Board board);

}
