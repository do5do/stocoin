package com.sc.stocoin.model;

import java.sql.Date;

import lombok.Data;

@Data
public class Reply {
	private int bno;
	private int rno;
	private String content;
	private Date dates;
	private String del;
	private Integer mno;
	private int likes;
	// join
	private String nick;
	// paging
	private int startRow;
	private int endRow;
}
