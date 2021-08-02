package com.sc.stocoin.model;

import java.sql.Date;

import lombok.Data;
@Data
public class TradeStock {
	private int mno;
	private int ts_no;
	private String sname;
	private String code;
	private int types;
	private Date dates;
	private int cnt;
	private int contract; // 체결 가격
}
