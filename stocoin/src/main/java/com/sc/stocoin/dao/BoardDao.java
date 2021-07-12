package com.sc.stocoin.dao;

import java.util.List;

import com.sc.stocoin.model.Board;

public interface BoardDao {

	int insert(Board board);

	List<Board> boardList();

}
