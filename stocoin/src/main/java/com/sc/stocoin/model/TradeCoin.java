package com.sc.stocoin.model;

import java.sql.Date;

import lombok.Data;

@Data
public class TradeCoin {
	private int mno;
	private int tc_no;
	private String cname;
	private int types;
	private Date dates;
	private float cnt;
	private int contract; // 체결 가격
}
