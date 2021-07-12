package com.sc.stocoin;

import java.io.BufferedReader;
import java.io.InputStreamReader;

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
	@RequestMapping("testPy")
	public String testPy() {
		try {
			String line;
			Process p = Runtime.getRuntime().exec("python C:\\BigData\\python\\kiwoom-main\\tutorials\\2.Login.py");
			BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
					while ((line = input.readLine()) != null) {
					System.out.println(line);
					}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return "exclude/testPy";
	}
}
