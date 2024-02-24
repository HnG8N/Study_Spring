package com.springlec.base.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class UController {
	
	// 사용자 로그인 첫화면
	@GetMapping("/")
	public String login(HttpServletRequest request) throws Exception{
		// session부터 정리하고 시작하자!
		HttpSession session = request.getSession(); // session 만들 때 jakarta.servlet.~가 import 되어야 함
		session.invalidate();
		return "login";
	}
	// 사용자 등록 화면
	@PostMapping("loginCheck")
	public String loginCheck(HttpServletRequest request) throws Exception{
		HttpSession session = request.getSession();
		session.setAttribute("userid", request.getParameter("userid"));
		session.setAttribute("password", request.getParameter("password"));
		
		return "registration";
	}
}
