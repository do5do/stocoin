package com.sc.stocoin.service;

import lombok.Data;

@Data
public class PagingBean {
	private int currentPage;
	private int rowPerPage;
	private int total;
	private int totalPage;
	private int pagePerBlock = 5; // 몇 페이지씩 보여줄건지
	private int startPage;
	private int endPage;
	
	public PagingBean(int currentPage, int rowPerPage, int total) {
		this.currentPage = currentPage;
		this.rowPerPage = rowPerPage;
		this.total = total;
		
		totalPage = (int) Math.ceil((double) total/rowPerPage);
		startPage = currentPage - (currentPage - 1) % pagePerBlock;
		endPage = startPage + pagePerBlock - 1;
		if (endPage > totalPage) endPage = totalPage;
	}
	
}
