package com.sc.stocoin.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sc.stocoin.model.Qna;
import com.sc.stocoin.model.QnaReply;
import com.sc.stocoin.service.PagingBean;
import com.sc.stocoin.service.QnaReplyService;
import com.sc.stocoin.service.QnaService;

@Controller
public class QnaController {
	@Autowired
	private QnaService qs;
	
	@Autowired
	private QnaReplyService qrs;
	
	@RequestMapping("/board/qaWriteForm")
	public String qaWriteForm() {
		return "board/qaWriteForm";
	}
	
	@RequestMapping("/board/qaWriteResult")
	public String qaWriteResult(Qna qna, Model model, HttpSession session) {
		int mno = (int) session.getAttribute("mno");
		
		qna.setMno(mno);
		if (qna.getSecret() == null) {
			qna.setSecret("n");
		}
		
		int result = qs.insert(qna);
		int types = 3;
		
		model.addAttribute("result", result);
		model.addAttribute("types", types);
		return "board/qaWriteResult";
	}
	
	@RequestMapping("/board/qaList")
	public String qaList(Qna qna, String types, String pageNum, Model model) {
		if (pageNum == null || pageNum.equals("")) {
			pageNum = "1";
		}
		int currentPage = Integer.parseInt(pageNum);
		int rowPerPage = 8; // 페이지당 리스트 갯수
		int startRow = (currentPage - 1) * rowPerPage + 1;
		int endRow = startRow + rowPerPage - 1;
		
		qna.setStartRow(startRow);
		qna.setEndRow(endRow);
		
		List<Qna> list = qs.qaList(qna);
		int total = qs.getTotal();
		
		// paging
		PagingBean pb = new PagingBean(currentPage, rowPerPage, total);
		
		model.addAttribute("types", types);
		model.addAttribute("list", list);
		model.addAttribute("pb", pb);
		return "board/qaList";
	}
	
	@RequestMapping("/board/qaDetail")
	public String qaDetail(int qno, Model model) {
		// 문의글
		Qna qna = qs.select(qno);
		
		// 문의글에 대한 답변
		QnaReply qr = qrs.select(qno);
		
		model.addAttribute("qr", qr);
		model.addAttribute("qna", qna);
		return "board/qaDetail";
	}
	
	@RequestMapping("/board/qnaReplyWrite")
	public String qnaReplyFormResult(QnaReply qr, Model model) {
		int result = qrs.insert(qr);
		model.addAttribute("result", result);
		model.addAttribute("qno", qr.getQno());
		return "board/qnaReplyWrite";
	}
	
}
