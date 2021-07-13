package com.sc.stocoin.controller;
import java.io.IOException;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sc.stocoin.model.Member;
import com.sc.stocoin.service.MemberService;
@Controller
public class MemberController {
    @Autowired
    private MemberService ms;
    
    @RequestMapping("login")
    public String login(@RequestParam(value = "code", required = false) String code, HttpSession session, Model model) throws Exception{
//        System.out.println("#########" + code);
//        String access_Token = memberService.getAccessToken(code);
//        Object result = memberService.insert(access_Token);
//        session.setAttribute("access_Token", access_Token);
//        model.addAttribute("result", result);
    	
    	String access_Token = ms.getAccessToken(code);
    	HashMap<String, Object> userInfo = ms.getUserInfo(access_Token);
    	String id = (String) userInfo.get("id");
    	Member member = ms.select(id);
    	if (member == null) { // 회원 가입 일 때
    		ms.insert(userInfo);
    	} else {
    		if (member.getDel().equals("y")) {
    			ms.updateDel(id);
    		}
    		session.setAttribute("id", id);
    		session.setAttribute("access_Token", access_Token);
    	}
        return "member/login";
    }
    
    @RequestMapping("delete")
    public String logout(HttpSession session) throws IOException {
    	String access_Token = (String) session.getAttribute("access_Token");
    	String id = (String) session.getAttribute("id");
        ms.delete(access_Token, id);
        session.invalidate();
        return "member/delete";
    }
    
    @RequestMapping("logout")
    public String delete(HttpSession session) {
    	session.invalidate();
        return "member/logout";
    }
}