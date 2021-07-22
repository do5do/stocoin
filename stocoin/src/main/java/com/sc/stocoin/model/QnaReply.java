package com.sc.stocoin.model;

import java.sql.Date;

import lombok.Data;
@Data
public class QnaReply {
	private int qr_no;
	private int qno;
	private String content;
	private Date dates;
}
