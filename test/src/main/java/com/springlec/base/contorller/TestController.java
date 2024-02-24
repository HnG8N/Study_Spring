package com.springlec.base.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping("/")
	public String test() throws Exception {
		return "ajax-test";
	}
}
