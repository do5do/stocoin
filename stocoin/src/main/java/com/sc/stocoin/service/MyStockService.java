package com.sc.stocoin.service;

import java.util.List;

import com.sc.stocoin.model.MyStock;

public interface MyStockService {

	int insert(MyStock myStock);

	MyStock select(MyStock myStock);

	int update(MyStock myStock);

	int updateSell(MyStock myStock);

	MyStock selectCnt(String sname, int mno);

	List<MyStock> selectMy(int mno);

	void deleteMno(int mno);

	
}
