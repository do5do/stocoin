package com.sc.stocoin.model;

import java.sql.Date;

import lombok.Data;

@Data
public class Chat {
    private int cno;
	private String nick;
	private String content;
	private Date dates;
}
