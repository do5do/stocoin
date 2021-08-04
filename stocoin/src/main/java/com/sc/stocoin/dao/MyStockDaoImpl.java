package com.sc.stocoin.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sc.stocoin.model.MyStock;

@Repository
public class MyStockDaoImpl implements MyStockDao {
	@Autowired
	private SqlSessionTemplate sst;

	@Override
	public int insert(MyStock myStock) {
		return sst.insert("mystockns.insert", myStock);
	}

	@Override
	public MyStock select(MyStock myStock) {
		return sst.selectOne("mystockns.select", myStock);
	}

	@Override
	public int update(MyStock myStock) {
		return sst.update("mystockns.update", myStock);
	}

	@Override
	public int updateSell(MyStock myStock) {
		return sst.update("mystockns.updateSell", myStock);
	}

	@Override
	public MyStock selectCnt(String sname, int mno) {
		HashMap<String, Object> hm = new HashMap<>();
		hm.put("sname", sname);
		hm.put("mno", mno);
		return sst.selectOne("mystockns.selectCnt", hm);
	}

	@Override
	public List<MyStock> selectMy(int mno) {
		return sst.selectList("mystockns.selectMy", mno);
	}

	@Override
	public void deleteMno(int mno) {
		sst.delete("mystockns.deleteMno", mno);
	}
}
