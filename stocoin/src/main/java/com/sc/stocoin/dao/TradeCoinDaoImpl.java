package com.sc.stocoin.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sc.stocoin.model.MyCoin;
import com.sc.stocoin.model.TradeCoin;
import com.sc.stocoin.model.TradeStock;

@Repository
public class TradeCoinDaoImpl implements TradeCoinDao {
	@Autowired
	private SqlSessionTemplate sst;
	
	// 거래내역
	@Override
	public void tradeInsert(TradeCoin tc) {
		sst.insert("tradeCoinns.insert", tc);
	}
	
	@Override
	public void tradeDelete(int mno) {
		sst.delete("tradeCoinns.delete", mno);
	}

	@Override
	public int avgContract(String cname, int mno) {
		HashMap<String, Object> hm = new HashMap<>();
		hm.put("mno", mno);
		hm.put("cname", cname);		
		return sst.selectOne("tradeCoinns.avgContract", hm);
	}

	@Override
	public List<TradeStock> tradeList(int mno) {
		return sst.selectList("tradeCoinns.tradeList", mno);
	}
	
	// 보유현황
	@Override
	public MyCoin mySelect(int mno, String name) {
		HashMap<String, Object> hm = new HashMap<>();
		hm.put("mno", mno);
		hm.put("cname", name);		
		return sst.selectOne("myCoinns.select", hm);
	}

	@Override
	public int myInsert(MyCoin mc) {
		return sst.insert("myCoinns.insert", mc);
	}

	@Override
	public int myUpdateBuy(MyCoin mc) {
		return sst.update("myCoinns.updateBuy", mc);
	}

	@Override
	public int myUpdateSell(MyCoin mc) {
		return sst.update("myCoinns.updateSell", mc);
	}

	@Override
	public List<MyCoin> myCoinName(int mno) {
		return sst.selectList("myCoinns.myCoinName", mno);
	}

	@Override
	public void myDelete(int mno) {
		sst.delete("myCoinns.delete", mno);
	}

	@Override
	public List<MyCoin> myCoinList(int mno) {
		return sst.selectList("myCoinns.myCoinList", mno);
	}


}
