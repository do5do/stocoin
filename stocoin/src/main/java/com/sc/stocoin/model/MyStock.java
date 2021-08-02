package com.sc.stocoin.model;

import lombok.Data;

@Data
public class MyStock {
	private int mno;
	private int ms_no;
	private String sname;
	private String code;
	private int cnt;
	private int purchase; // 매입 금액
}
