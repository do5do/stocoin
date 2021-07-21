package com.sc.stocoin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@RequestMapping("chat")
	public String chat() {
		return "exclude/chat";
	}
}
