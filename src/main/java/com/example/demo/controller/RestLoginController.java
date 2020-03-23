package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestLoginController {

	@RequestMapping(value="/ActionWithData", produces="text/plaine;charset=UTF-8")//글자를 응답할거야
	public String actionWithData(String name, int age) {
		String str = "";
		System.out.println("Ajax 통신입니다");
		System.out.println("이름: " +name);
		System.out.println("나이: " +age);
		str = "<h2>로그인 하였습니다</h2>";
		return str;
		
	}
	
}
