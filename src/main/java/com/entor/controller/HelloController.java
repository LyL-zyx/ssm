package com.entor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/index")
	public String index() {
		System.out.println("Hello World");
		return "index";
	}

	@RequestMapping("/hello")
	public String hello() {
		//默认是请求转发到jsp页面
		return "hello";
	}
	
	@RequestMapping("/login")
	public String login() {
		//重定向到jsp
		return "redirect:login.jsp";
	}
	
	@RequestMapping("/delete")
	public String delete() {
		//重定向到另一个请求地址
		return "redirect:/index";
		
	}
	
	@RequestMapping("/update")
	public String update() {
		//请求转发到另一个请求地址
		return "forward:/index";
	}
}
