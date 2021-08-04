package com.sc.stocoin.model;

import lombok.Data;

@Data
public class MyCoin {
	private int mno;
	private int mc_no;
	private String cname;
	private String cname_ko;
	private float cnt;
	private int purchase; // 매입 금액
}
