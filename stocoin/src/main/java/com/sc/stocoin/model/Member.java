package com.sc.stocoin.model;
import java.sql.Date;
import lombok.Data;

@Data
public class Member {
	private int mno;
	private String nick;
	private Date reg_date;
	private String email;
	private String del;
}
