package com.sc.stocoin.controller;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sc.stocoin.model.Admin;
import com.sc.stocoin.model.Member;
import com.sc.stocoin.service.AdminService;
import com.sc.stocoin.service.MemberService;
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
		//Admin admin2 = as.select(admin.getId());
		if (admin == null || !admin.getId().equals("admin")) 
			result = -1;
		else if (admin.getPwd().equals("1234")) {
			result = 1;
			session.setAttribute("id", admin.getId());
		}
		
		model.addAttribute("result", result);
		return "admin/adminLogin"; 
	}
	
//	@RequestMapping("/admin/adminPage")
//	public String adminPage(HttpSession session, Model model) {
//		String id = (String)session.getAttribute("id");
//		Admin admin = as.select(id);
//		List<Admin> list = as.listAdmin(id);
//		model.addAttribute("admin", admin);
//		model.addAttribute("list",list);
//		return "admin/adminPage";
//	}
    @RequestMapping("/admin/adminLogout")
    public String delete(HttpSession session) {
    	session.invalidate();
        return "admin/adminLogout";
    }
	@RequestMapping("/admin/adminPage")
	public String member(HttpSession session, Model model) {
		String id = (String)session.getAttribute("id");
//		Admin admin = as.select(id);
		Member member = ms.select(id);
		List<Member> list = ms.list();
		System.out.println("size="+list.size());
		model.addAttribute("member", member);
		model.addAttribute("list",list);
		return "admin/adminPage";
	}
}
