package com.entor.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entor.entity.User;

@Controller
public class Test1Controller {
	
	@RequestMapping("/getUser")
	public String getUser(HttpServletRequest request) {
		User user = new User();
		user.setId(1);
		user.setUsername("规范让对方");
		user.setPassword("123435");
		request.setAttribute("user", user);
		return "index";
	}
	
	@RequestMapping("/getUser1")
	public String getUser1(Map<String,Object> map) {
		User user = new User();
		user.setId(1);
		user.setUsername("二外若翁人");
		user.setPassword("123435");
		map.put("user", user);
		return "index";
	}
	
	
	@RequestMapping("/getUser2")
	public String getUser2(Model model) {
		User user = new User();
		user.setId(1);
		user.setUsername("胜多负少");
		user.setPassword("123435");
		model.addAttribute("user", user);
		return "index";
	}
	
}
