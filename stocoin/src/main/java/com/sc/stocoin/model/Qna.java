package com.sc.stocoin.model;

import java.sql.Date;

import lombok.Data;

@Data
public class Qna {
	private int qno;
	private String title;
	private String content;
	private Date dates;
	private String secret; // y,n
	private int mno;
	// paging
	private int startRow;
	private int endRow;
}
