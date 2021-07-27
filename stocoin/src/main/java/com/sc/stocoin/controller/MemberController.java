package com.sc.stocoin.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sc.stocoin.model.Member;
import com.sc.stocoin.service.MemberService;

@Controller
public class MemberController{
    @Autowired
    private MemberService ms;
    
    private String url;
    
    @RequestMapping("login2")
    @ResponseBody
    public String login2(String curUrl) {
    	this.url = curUrl;
    	return curUrl;
    }
    
    @RequestMapping("login")
    public String login(@RequestParam(value = "code", required = false) String code, HttpSession session, Model model) throws Exception{
    	// 사용자 토큰, 정보 가져오기
    	String access_Token = ms.getAccessToken(code);
    	HashMap<String, Object> userInfo = ms.getUserInfo(access_Token);
    	// 아이디 설정
    	String id = (String) userInfo.get("id");
    	String nick = (String) userInfo.get("nick");
    	// 회원가입 유무 판별
    	Member member = ms.select(id);
    	int mno = -1;
    	int result = 1;
    
    	if (member == null) { // 처음 회원 가입 일 때
    		ms.insert(userInfo);
    	} else {
    		if (member.getDel().equals("y")) { // 두 번째(이상) 회원 가입 일 때
    			ms.updateDel(userInfo);
    		} else { // 그냥 로그인 일 때
    			nick = member.getNick();
    			result = 0;
    		}
    		mno = member.getMno();
    	} 
    	
    	session.setAttribute("mno", mno);
    	session.setAttribute("id", id);
    	session.setAttribute("access_Token", access_Token);
    	session.setAttribute("nick", nick);

    	// 이전 주소 가져오기
    	String prevUrl = url;
    	model.addAttribute("prevUrl", prevUrl);
    	model.addAttribute("result", result);
    	
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
    
    @RequestMapping("/member/updateForm")
    public String updateForm(HttpSession session, Model model, HttpServletRequest request) {
    	String id = (String) session.getAttribute("id");
    	Member member = ms.select(id);
    	String prevUrl2 = request.getHeader("referer").substring(21);
    	model.addAttribute("prevUrl2", prevUrl2);
    	model.addAttribute("member", member);
    	return "member/updateForm";
    }

    @RequestMapping("/member/update")
    public String update(Member member, String prevUrl2, Model model, HttpSession session) {
    	int result = 0;
    	String prevUrl = url;
    	session.removeAttribute("nick");

    	Member member2 = ms.select(member.getId());
    	if (!member2.getNick().equals(member.getNick())) {
    		result = ms.update(member);
    	}
    	member2 = ms.select(member.getId());
    	
    	session.setAttribute("nick", member2.getNick());
    	model.addAttribute("prevUrl", prevUrl);
    	model.addAttribute("prevUrl2", prevUrl2);
    	model.addAttribute("result", result);
    	return "member/update";
    }
    
    @RequestMapping(value = "/member/nickChk2", produces = "text/html;charset=utf-8")
    @ResponseBody 
    public String nickChk2(String nick) {
       String msg = "";
       Member member = ms.selectNick(nick);
       if (member == null) {
          msg = "사용가능한 닉네임입니다.";
       } else {
          msg = "이미 사용중인 닉네임입니다.";
       }
       return msg;
    }
}