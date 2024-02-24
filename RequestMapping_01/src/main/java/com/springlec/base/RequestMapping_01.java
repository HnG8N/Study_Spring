package com.springlec.base;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class RequestMapping_01 {
	
	@GetMapping("/")
	public String goIndex() {
		return "index";
	}
	@GetMapping("studentGet") // "studentGet" 앞에 / 없어도 됨
	public String studentIdGet(@RequestParam("id") String id, Model model) {
//		model.addAttribute("studentId", id);
//		return "student/studentId";
		if(id.equals("abc")) {
			return "redirect:studentOK"; // studentOK라는 Get(Post)Mapping으로 감
		}
		return "redirect:studentNG"; // studentNG라는 Get(Post)Mapping으로 감
		
	}
	@PostMapping("studentPost")
	public String studentIdPost(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		model.addAttribute("studentId", id);
		return "student/studentId";
	}
	@GetMapping("studentOK")
	public String studentOK() {
		return "student/studentOK";
	}
	@GetMapping("studentNG")
	public String studentNG() {
		return "student/studentNG";
	}
}
