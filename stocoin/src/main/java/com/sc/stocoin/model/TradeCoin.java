package com.sc.stocoin.model;

import java.sql.Date;

import lombok.Data;

@Data
public class TradeCoin {
	private int mno;
	private int tc_no;
	private String cname;
	private String cname_ko;
	private int types;
	private Date dates;
	private float cnt;
	private float contract; // 체결 가격
}
