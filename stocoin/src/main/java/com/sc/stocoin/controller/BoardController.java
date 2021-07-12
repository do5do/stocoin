package com.sc.stocoin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sc.stocoin.model.Board;
import com.sc.stocoin.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	private BoardService bs;
	
	@RequestMapping("/board/boardList")
	public String boardList(Model model) {
		List<Board> list = bs.boardList();
		model.addAttribute("list", list);
		return "board/boardList";
	}
	
	@RequestMapping("/board/boardWriteForm")
	public String boardWriteForm() {
		return "board/boardWriteForm";
	}
	
	@RequestMapping("/exclude/summernoteForm")
	public String summernoteForm() {
		return "exclude/summernoteForm";
	}
	
	@RequestMapping("/board/boardWriteResult")
	public String boardWriteResult(Board board, Model model) {
		int result = bs.insert(board);
		model.addAttribute("result", result);
		return "board/boardWriteResult";
	}
}
