package com.springlec.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class image {
	
	@GetMapping("/") // 받는 이름 (주소창에 나오는 경로)
	public String images() {
		System.out.println("Google Images!");
		return "index"; // 쓰는 이름 (index.jsp 파일을 씀)
	}

}
