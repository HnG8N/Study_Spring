package com.springlec.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springlec.base.service.CalcService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class AController {
	
	@Autowired // Bean과 연결 시켜줌
	CalcService service;
	
	// 계산 입력 화면
	@GetMapping("/")
	public String input() throws Exception {
		System.out.println(">>> input()");
		return "input";
	}
	
	// 계산 결과 화면
	@PostMapping("addCalc")
	public String calc(HttpServletRequest request, Model model) throws Exception {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		// @Autowired가 연결시켜 주기 때문에 new를 쓰지 않음
		int resultAdd = service.addition(num1, num2);
		int resultSub = service.subtraction(num1, num2);
		int resultMul = service.multiplication(num1, num2);
		double resultDiv = service.division(num1, num2);
		
		model.addAttribute("num1", num1);
		model.addAttribute("num2", num2);
		model.addAttribute("addition", resultAdd);
		model.addAttribute("substraction", resultSub);
		model.addAttribute("multiplication", resultMul);
		model.addAttribute("division", resultDiv);
		
		return "calcResult";
	}
}
