package com.brushup.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/*")
public class BoardController {

	@RequestMapping(value = "/write")
	public String write() {
				
		System.out.println("대체 뭐가 문제?");
		return "write";
	}
	
}
