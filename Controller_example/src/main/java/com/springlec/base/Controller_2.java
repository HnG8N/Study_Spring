package com.springlec.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class Controller_2 {
	@GetMapping("/view")
	public String view() {
		return "test/view";
	}

}
