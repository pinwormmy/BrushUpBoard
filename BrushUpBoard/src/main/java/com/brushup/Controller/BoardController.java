package com.brushup.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/*")
public class BoardController {

	@RequestMapping(value = "/write")
	public String write() {
				
		return "write";
	}
	
}
