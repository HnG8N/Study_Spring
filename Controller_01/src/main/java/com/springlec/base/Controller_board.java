package com.springlec.base;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
// @RequestMapping("/board")을 해주면 /board를 안써도 됨.
@RequestMapping("/board")
public class Controller_board {
	// "/board/view" -> view.jsp 출력
	@GetMapping("/view")
	public String board_view() {
		return "board/view";
	}
	// Attribute 저장 (Model을 쓰는 방법)
	@GetMapping("/content")
	public String board_content(Model model) {
		model.addAttribute("id", "won");
		model.addAttribute("age", "30");
		return "board/content";
	}
	// Attribute 저장 및 보여주기 (new가 생성되서 잘 안 씀, 초창기 방식)
	@GetMapping("/reply")
	public ModelAndView board_reply() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("id", "Lee");
		mv.addObject("age", "30");
		mv.setViewName("board/reply");
		return mv;
	}
}
