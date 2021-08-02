package com.sc.stocoin.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sc.stocoin.model.Board;
import com.sc.stocoin.model.Member;
import com.sc.stocoin.model.Qna;
import com.sc.stocoin.model.Reply;
import com.sc.stocoin.model.ReplyLikes;
import com.sc.stocoin.service.BoardService;
import com.sc.stocoin.service.MemberService;
import com.sc.stocoin.service.PagingBean;
import com.sc.stocoin.service.QnaService;
import com.sc.stocoin.service.ReplyLikesService;
import com.sc.stocoin.service.ReplyService;

@Controller
public class BoardController {
	@Autowired
	private BoardService bs;

	@Autowired
	private ReplyService rs;

	@Autowired
	private MemberService ms;
	
	@Autowired
	private ReplyLikesService rls;
	
	@Autowired
	private QnaService qs;
	
	// board update
	private Integer bno;

	@RequestMapping("/board/boardList")
	public String boardList(Board board, String pageNum, String types, Model model) {
		if (pageNum == null || pageNum.equals("")) {
			pageNum = "1";
		}
		
		if (types == null || types.equals("")) {
			types = "1";
		}
				
		int currentPage = Integer.parseInt(pageNum);
		int rowPerPage = 8; // 페이지당 리스트 갯수
		int startRow = (currentPage - 1) * rowPerPage + 1;
		int endRow = startRow + rowPerPage - 1;
		// type setting
		int typeInt = Integer.parseInt(types);
		
		board.setStartRow(startRow);
		board.setEndRow(endRow);
		board.setTypes(typeInt);
		
		// 리스트 가져오기
		List<Board> list = bs.boardList(board);
		int total = bs.getTotal(board);
		
		// paging
		PagingBean pb = new PagingBean(currentPage, rowPerPage, total);
		
		model.addAttribute("list", list);
		model.addAttribute("types", typeInt);
		model.addAttribute("pb", pb);
		return "board/boardList";
	}

	@RequestMapping("/board/boardWriteForm")
	public String boardWriteForm(int types, Model model) {
		model.addAttribute("types", types);
		return "board/boardWriteForm";
	}

	@RequestMapping("/exclude/summernoteForm")
	public String summernoteForm(int types, Integer bno, Model model) {
		if (bno != null) {		
			Board board = bs.select(bno);
			model.addAttribute("board", board);
		}
		model.addAttribute("types", types);
		return "exclude/summernoteForm";
	}

	@RequestMapping("/board/boardWriteResult")
	public String boardWriteResult(Board board, int types, Model model) {
		int result = bs.insert(board);
		
		model.addAttribute("result", result);
		model.addAttribute("types", types);
		return "board/boardWriteResult";
	}

	@RequestMapping("/board/boardDetail/bno/{bno}/types/{types}")
	public String boardDetail(@PathVariable int bno, @PathVariable int types,  Model model) {
		Board board = bs.select(bno);
		// views count
		bs.updateViews(bno);
		
		model.addAttribute("types", types);
		model.addAttribute("board", board);
		return "board/boardDetail";
	}
	
	@RequestMapping("/board/boardUpdate/bno/{bno}")
	public String boardUpdate(@PathVariable int bno, Model model) {
		Board board = bs.select(bno);
		int types = board.getTypes();
		
		model.addAttribute("types", types);
		model.addAttribute("bno", board.getBno());
		return "board/boardUpdate";
	}
	
	@RequestMapping("/board/boardUpdateResult")
	public String boardUpdateResult(Board board, int types, Model model) {
		int result = bs.update(board);
		int bno = board.getBno();
		
		model.addAttribute("result", result);
		model.addAttribute("types", types);
		model.addAttribute("bno", bno);
		return "board/boardUpdateResult";
	}

	@RequestMapping("/board/boardDelete/bno/{bno}")
	public String boardDelete(@PathVariable int bno, int types, Model model) {
		int result = bs.delete(bno);
		model.addAttribute("result", result);
		model.addAttribute("types", types);
		return "board/boardDelete";
	}
	
	@RequestMapping("/board/insertBoard")
	public String insertBoard(int types) {
		for (int i = 0; i <100; i++) {			
			Board board = new Board();
			board.setTitle("오늘의 운세 "+i);
			board.setContent(i+"번 투신자판 하세요.");
			board.setTypes(types);
			bs.insert(board);
		}
		return "redirect:/board/boardList";
	}
	
	
	// reply start
	@RequestMapping("/exclude2/boardReplyList/bno/{bno}")
	public String boardReplyList(@PathVariable int bno, String pageNum, Model model, HttpSession session) {
		if (pageNum == null || pageNum.equals("")) {
			pageNum = "1";
		}
		int currentPage = Integer.parseInt(pageNum);
		int rowPerPage = 5; // 페이지당 리스트 갯수
		int startRow = (currentPage - 1) * rowPerPage + 1;
		int endRow = startRow + rowPerPage - 1;
		
		Reply reply = new Reply();
		reply.setBno(bno);
		reply.setStartRow(startRow);
		reply.setEndRow(endRow);
		
		// 댓글 리스트
		List<Reply> list = rs.replyList(reply);
		int total = rs.getTotal(reply);
		
		// paging 처리
		PagingBean pb = new PagingBean(currentPage, rowPerPage, total);
		
		// replyLikes에서 로그인한 회원이 좋아요 했는지 조회
		if (session.getAttribute("mno") != null) {
			int mno = (int) session.getAttribute("mno");
			List<ReplyLikes> mnoList = rls.selectMno(mno, bno);
			
			if (mnoList != null) {
				model.addAttribute("mnoList", mnoList);
			}
		}
	
		model.addAttribute("replyList", list);
		model.addAttribute("bno", bno);
		model.addAttribute("pb", pb);
		return "exclude2/boardReplyList";
	}
	
	@RequestMapping("/board/boardReplyWrite")
	public String boardReplyWrite(Reply reply, Model model, HttpSession session) {
		String id = (String) session.getAttribute("id");
		Member member = ms.select(id);
		// mno setting
		reply.setMno(member.getMno());
		rs.insert(reply);

		return "redirect:/exclude2/boardReplyList/bno/" + reply.getBno(); // controller내의 redirect 메소드 호출
	}
	
	@RequestMapping("/board/boardReplyUpdate")
	public String boardReplyUpdate(Reply reply, Model model) {
		rs.update(reply);
		return "redirect:/exclude2/boardReplyList/bno/" + reply.getBno();
	}
	
	@RequestMapping("/board/boardReplyDelete")
	public String boardReplyDelete(Reply reply, Model model) {
		rs.delete(reply);
		return "redirect:/exclude2/boardReplyList/bno/" + reply.getBno();
	}
	
	// 댓글 좋아요
	@RequestMapping("/board/boardReplyLikes")
	@ResponseBody
	public int boardReplyLikes(ReplyLikes rl, Model model) {
		// replyLikes에서 조회
		ReplyLikes rl2 = rls.select(rl);
		
		int likes = rs.selectLikes(rl.getRno(), rl.getMno());
		if (rl2 == null) {
			// replyLikes에 insert
			rls.insertLikes(rl);
			likes += 1;
		} else {
			rls.deleteLikes(rl);
			likes -= 1;
		}
		Reply reply = new Reply();
		reply.setBno(rl.getBno());
		reply.setRno(rl.getRno());
		reply.setLikes(likes);
		
		// reply에 likes 없데이트
		rs.updateLikes(reply);
		
		return likes;
	}
}
