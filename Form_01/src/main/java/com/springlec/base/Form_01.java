package com.springlec.base;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class Form_01 {
	@GetMapping("/board/confirmId")
	public String confirmId(HttpServletRequest request, Model model) {
		// parameter 받기
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
	
		return "board/confirmId";
	}
	
	@GetMapping("/board/checkId")
	public String checkId(@RequestParam("id") String id,
						  @RequestParam("pw") int pw,
						  Model model) {
		model.addAttribute("identify", id);
		model.addAttribute("password", pw);
		
		return "board/checkId";
	}
	
//	@GetMapping("/member/join")
//	public String join( @RequestParam("name") String name,
//						@RequestParam("id") String id,
//						@RequestParam("pw") String pw,
//						@RequestParam("email") String email,
//						Model model) {
//		Member member = new Member();
//		member.setName(name);
//		member.setId(id);
//		member.setPw(pw);
//		member.setEmail(email);
//		
//		model.addAttribute("member", member);
//		
//		return "member/join";
//	}
	// jsp와 dto의 순서와 갯수가 같으면 쉽게 parameter를 처리 가능
	@GetMapping("member/join")
	public String join(Member member) {
		return "member/join";
	}
	
	
	
} // End
