package com.sc.stocoin.model;
import java.sql.Date;
import lombok.Data;

@Data
public class Member {
	private int mno;
	private String id;
	private String nick;
	private Date reg_date;
	private Integer coin_money;
	private Integer stock_money;
	private String del;
	//paging
	private int startRow; 
	private int endRow;
}
