package com.springlec.base.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springlec.base.model.Address_Dto;
import com.springlec.base.service.Address_Dao_Service;

import jakarta.servlet.http.HttpServletRequest;

// 컨트롤러라고 선언
@Controller
public class Address_Controller {
	
	//serivce와 연결
	@Autowired
	Address_Dao_Service service;
	
	// service의 addressListDao라는 method의 return값을 addressDto라는 변수에 담음
	// model에 key값은 address, value값은 addresDto라고 담아서
	// addresslist.jsp에 보낸 후 보여줌
	@GetMapping("/")
	public String addresslist(Model model) throws Exception{
		List<Address_Dto> addressListDto = service.addressListDao();
		model.addAttribute("address", addressListDto);
		return "addresslist";
	}
	// writeForm이 주소창에 입력 되면
	// addresswrite.jsp로 return해 보여줌
	@GetMapping("writeForm")
	public String writeForm() throws Exception{
		return "addresswrite";
	}
	// write가 주소창에 입력되면
	// parameter값을 받아와 addressInsertDao라는 method를 실행
	// 그 후 /로 redirect
	@PostMapping("write")
	public String write(HttpServletRequest request) throws Exception{
		service.addressInsertDao(request.getParameter("name"),
								request.getParameter("telno"),
								request.getParameter("email"),
								request.getParameter("address"),
								request.getParameter("relation"));
		return "redirect:/";
	}
	@GetMapping("view")
	// addresslist.jsp에서 번호를 클릭하면 seqno를 받아와서
	public String view(HttpServletRequest request, Model model) throws Exception{
		// addressViewDto라는 변수에 addressViewDao라는 method를 실행 후 return 값을 저장
		Address_Dto addressViewDto = 
				service.addressViewDao(Integer.parseInt(request.getParameter("seqno")));
		// model에 key값을 view, value값을 addressViewDto라고 저장 후 
		model.addAttribute("view", addressViewDto);
		// addressview.jsp에 보낸 후 보여줌
		return "addressview";
	}
	@PostMapping("update")
	public String update(HttpServletRequest request) throws Exception{
		service.addressViewUpdateDao(Integer.parseInt(request.getParameter("seqno")),
									request.getParameter("name"),
									request.getParameter("telno"),
									request.getParameter("email"),
									request.getParameter("address"),
									request.getParameter("relation"));
		return "redirect:/";
	}
	
	@GetMapping("delete")
	public String delete(HttpServletRequest request) throws Exception{
		service.addressViewDeleteDao(Integer.parseInt(request.getParameter("seqno")));
		return "redirect:/";
	}
	// list에서 검색버튼을 눌렀을 때
	@PostMapping("listQuery")
	public String listQuery(HttpServletRequest request, Model model) throws Exception{
		List<Address_Dto> listDao = service.listQuery(request.getParameter("query"), request.getParameter("content"));
		model.addAttribute("address", listDao);
		return "addresslist";
	}

}
