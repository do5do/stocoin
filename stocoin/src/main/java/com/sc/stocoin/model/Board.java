package com.sc.stocoin.model;

import java.sql.Date;

import lombok.Data;
@Data
public class Board {
	private int bno;
	private String title;
	private String content;
	private Date dates;
	private int views;
	private String del;
	private int types;
}
