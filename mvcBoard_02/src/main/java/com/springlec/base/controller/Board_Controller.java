package com.springlec.base.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springlec.base.model.Board_Dto;
import com.springlec.base.service.Board_DaoService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class Board_Controller {
	
	@Autowired
	Board_DaoService service;
	
	// /가 주소창에 입력되면 writeForm.jsp를 불러옴
	@GetMapping("/")
	public String writeForm() throws Exception {
		return "writeForm";
	}
	// write가 주소창에 입력되면 writeForm에서 입력된 bName, bContent값을 가져오고
	// service의 insertDao method를 실행
	// 그 후 list로 redirect
	@GetMapping("write")
	public String write(HttpServletRequest request) throws Exception {
		service.insertDao(request.getParameter("bName"), request.getParameter("bContent"));
		return "redirect:list";
	}
	
	// list가 주소창에 입력되면 listDtos라는 변수에 service.listDao에서 만든 List<>를 저장 후
	// model.addAttribute를 통해 "list"라는 key값에 listDtos라는 value값을 저장한 후 list.jsp에 전송
	// 그 후 list.jsp를 불러옴
	@GetMapping("list")
	public String list(Model model) throws Exception {
		List<Board_Dto> listDtos = service.listDao();
		model.addAttribute("list" ,listDtos);
		return "list";
	}

	// delete가 주소창에 입력되면 받은 bId값을 통해 serice.deleteDao를 실행
	// 그 후 list로 redirect
	@GetMapping("delete")
	public String delete(HttpServletRequest request) throws Exception {
		service.deleteDao(Integer.parseInt(request.getParameter("bId")));
		return "redirect:list";
	}
}
