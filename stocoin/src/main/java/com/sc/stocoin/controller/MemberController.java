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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sc.stocoin.model.Member;
import com.sc.stocoin.service.FavoriteCoinService;
import com.sc.stocoin.service.FavoriteStockService;
import com.sc.stocoin.service.MemberService;
import com.sc.stocoin.service.MyStockService;
import com.sc.stocoin.service.TradeCoinService;
import com.sc.stocoin.service.TradeStockService;

@Controller
public class MemberController{
    @Autowired
    private MemberService ms;
    
    @Autowired
    private TradeCoinService tcs;
    
	@Autowired
	private FavoriteCoinService fcs;
    
    @Autowired
    private TradeStockService tss;
    
    @Autowired
    private MyStockService mss;
 
    @Autowired
	private FavoriteStockService fss;
    
    private String url;
    private String mode;
    
    @RequestMapping("mode")
    @ResponseBody
    public String mode(String mode, HttpSession session) {
    	session.setAttribute("mode", mode);
    	this.mode = mode;
    	return mode;
    }
    
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
    		Member member2 = ms.select(id);
    		mno = member2.getMno();
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
    	
    	// white/black 모드
    	String mode = this.mode;
    	session.setAttribute("mode", mode);

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
    	int mno = (int) session.getAttribute("mno");
        ms.delete(access_Token, id);
        tcs.tradeDelete(mno);
        tcs.myDelete(mno);
        fcs.deleteMno(mno);
        tss.deleteMno(mno);
        mss.deleteMno(mno);
        fss.deleteMno(mno);
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
    	model.addAttribute("member", member);
    	return "member/updateForm";
    }
    
    @RequestMapping("/member/joinForm")
    public String joinForm(HttpSession session, Model model, HttpServletRequest request) {
    	String id = (String) session.getAttribute("id");
    	Member member = ms.select(id);
    	model.addAttribute("member", member);
    	return "member/joinForm";
    }

    @RequestMapping("/member/update")
    public String update(Member member, Model model, HttpSession session) {
    	int result = 0;
    	session.removeAttribute("nick");

    	Member member2 = ms.select(member.getId());
    	if (!member2.getNick().equals(member.getNick())) {
    		result = ms.update(member);
    	}
    	member2 = ms.select(member.getId());
    	
    	session.setAttribute("nick", member2.getNick());
    	model.addAttribute("result", result);
    	return "member/update";
    }
    
    @RequestMapping(value = "/member/nickChk", produces = "text/html;charset=utf-8")
    @ResponseBody 
    public String nickChk(String nick) {
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