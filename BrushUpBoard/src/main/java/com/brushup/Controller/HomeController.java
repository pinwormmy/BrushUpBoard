package com.brushup.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		
		System.out.println("이 프로젝트 버리고 새로 쓴다 복사할거만 해서 옮기기");
		System.out.println(org.springframework.core.SpringVersion.getVersion());
	
		return "home";
	}

}
