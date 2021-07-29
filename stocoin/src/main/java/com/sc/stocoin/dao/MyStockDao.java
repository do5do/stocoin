package com.sc.stocoin.dao;

import com.sc.stocoin.model.MyStock;

public interface MyStockDao {

	int insert(MyStock myStock);

	MyStock select(MyStock myStock);

	int update(MyStock myStock);

	int updateSell(MyStock myStock);

	MyStock selectCnt(String sname, int mno);

}
