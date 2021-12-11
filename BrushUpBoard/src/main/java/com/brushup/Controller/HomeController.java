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
		System.out.println("그래서 일단 계속 프로젝트 생성 연습해서 암기해버릴거다");
		System.out.println("그때까진 이거로 일단 커밋만 하고");
		System.out.println("만족스러울 때 해당 프로젝트로 다시 깃허브 연동시키는거지");
		System.out.println("db생성은 일단 무난하게 되어서..기본세팅만 연습");
		
		System.out.println(org.springframework.core.SpringVersion.getVersion());
	
		return "home";
	}

}
