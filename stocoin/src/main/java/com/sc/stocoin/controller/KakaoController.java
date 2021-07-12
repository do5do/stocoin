package com.sc.stocoin.controller;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.sc.stocoin.service.KakaoService;
@Controller
public class KakaoController {
    @Autowired
    private KakaoService kakaoService;
    @RequestMapping("login")
    public String login(@RequestParam(value = "code", required = false) String code, HttpSession session ) throws Exception{
        System.out.println("#########" + code);
        String access_Token = kakaoService.getAccessToken(code);
        HashMap<String, Object> userInfo = kakaoService.getUserInfo(access_Token);
        System.out.println("###access_Token#### : " + access_Token);
        System.out.println("###userInfo#### : " + userInfo.get("email"));
        System.out.println("###nickname#### : " + userInfo.get("nickname"));
        System.out.println("###profile_image#### : " + userInfo.get("profile_image"));
        
        session.setAttribute("access_Token", access_Token);
        session.setAttribute("email", userInfo);
        return "member/login";
    }
    @RequestMapping("delete")
    public String logout(HttpSession session) {
        kakaoService.kakaoDelete((String)session.getAttribute("access_Token"));
        session.invalidate();
        return "member/delete";
    }
    @RequestMapping("logout")
    public String delete(HttpSession session) {
        //kakaoService.kakaoLogout((String)session.getAttribute("access_Token"));
    	session.invalidate();
        return "member/logout";
    }
}