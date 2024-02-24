package com.springlec.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controller_01 {
	
	// "/" -> view.jsp 출력
	@GetMapping("/")
	public String view() {
		return "view";
	}

}
