package com.entor.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entor.entity.User;

@Controller
public class TestController {

	@RequestMapping(value="/test",produces="text/html;charset=utf-8")
	@ResponseBody
	public String test() {
		return "你好Hello World!";
	}
	
	@RequestMapping("/test1")
	@ResponseBody
	public void test1(HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.write("你好Hello World!!");
		out.flush();
		out.close();
	}
	
	@RequestMapping("/getUserById/{id}")
	@ResponseBody
	public User getUserById(@PathVariable int id) {
		User user = new User();
		user.setId(id);
		user.setUsername("第六课");
		user.setPassword("21562");
		
		return user;
	}
	
	@RequestMapping("/getAll")
	@ResponseBody
	public List<User> getUserAll() {
		List<User> list = new ArrayList<User>();
		for(int i=0;i<10;i++) {
			User user = new User();
			user.setId(i);
			user.setUsername("第六课"+i);
			user.setPassword("21562");
			list.add(user);
		}
		return list;
	}
}
