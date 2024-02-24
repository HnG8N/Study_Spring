package com.springlec.base;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hello {
	
	@GetMapping("/") // 받는 이름
	public String hello() {
		System.out.println("Hello World!");
		return "index"; // 쓰는 이름
	}
}
