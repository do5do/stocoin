package com.sc.stocoin.controller;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sc.stocoin.model.Admin;
import com.sc.stocoin.model.Member;
import com.sc.stocoin.service.AdminService;
import com.sc.stocoin.service.MemberService;
import com.sc.stocoin.service.PagingBean;
	@Controller
public class AdminController {
	@Autowired
	private AdminService as;
	@Autowired
	private MemberService ms;
	
	@RequestMapping("/admin/adminLoginForm")
	public String adminLoginForm() {
		return "admin/adminLoginForm";
	}
	
	@RequestMapping("/admin/adminLogin")
	public String adminLogin(Admin admin, Model model, HttpSession session) {
		int result = 0; // 암호가 다름
		Admin admin2 = as.select(admin.getId());
		if (admin == null || !admin.getId().equals(admin2.getId())) 
			result = -1;
		else if (admin.getPwd().equals(admin2.getPwd())) {
			result = 1;
			session.setAttribute("id", admin.getId());
		}
		
		model.addAttribute("result", result);
		return "admin/adminLogin"; 
	}
	
    @RequestMapping("/admin/adminLogout")
    public String delete(HttpSession session) {
    	session.invalidate();
        return "admin/adminLogout";
    }
    
	@RequestMapping("/admin/adminPage")
	public String member(HttpSession session, Model model, String pageNum, Member member) {
		if (pageNum == null || pageNum.equals("")) {
			pageNum = "1";
		}	
		int currentPage = Integer.parseInt(pageNum);
		int rowPerPage = 8; // 페이지당 리스트 갯수
		int startRow = (currentPage - 1) * rowPerPage + 1;
		int endRow = startRow + rowPerPage - 1;
		member.setStartRow(startRow);
		member.setEndRow(endRow);
		List<Member> list = ms.list(member);	
		int total = ms.getTotal(member);
		PagingBean pb = new PagingBean(currentPage, rowPerPage, total);
		
		model.addAttribute("list", list);
		model.addAttribute("pb", pb);
		return "admin/adminPage";
	}
	
	@RequestMapping("/admin/memberOut/id/{id}")
    public String memberOut(@PathVariable String id, HttpSession session, Model model) throws IOException {
        as.memberOut(id);
    return "admin/memberOut";
	}
}