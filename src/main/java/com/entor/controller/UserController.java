package com.entor.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.entor.entity.User;

@Controller
public class UserController {
	
	@RequestMapping("/queryById")
	public String queryById(int id,String username,String password) {
		System.out.println("编号:"+id);
		System.out.println("姓名:"+username);
		System.out.println("密码:"+password);
		return "index";
	}
	
	@RequestMapping("queryByUid")
	public String queryById(User user) {
		System.out.println("编号:"+user.getId());
		System.out.println("姓名:"+user.getUsername());
		System.out.println("密码:"+user.getPassword());
		return "index";
		
	}
	
	@RequestMapping("/queryByUserId")
	public String queryById(HttpServletRequest request,HttpServletResponse response) {
		String id = request.getParameter("id");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("编号:"+id);
		System.out.println("姓名:"+username);
		System.out.println("密码:"+password);
		return "index";
		
	}
	@RequestMapping("/getById")
	public String getById(@RequestParam(defaultValue="1",name="qq",required=false) int id,@RequestParam(name="qw") String username,@RequestParam(name="qe") String password) {
		System.out.println("编号:"+id);
		System.out.println("姓名:"+username);
		System.out.println("密码:"+password);
		return "index";
	}
	
	@RequestMapping("/getId/{username}/{password}/{qq}.html")
	public String getId(@PathVariable(name="qq") int id, @PathVariable String username,@PathVariable String password) {
		System.out.println("编号:"+id);
		System.out.println("姓名:"+username);
		System.out.println("密码:"+password);
		return "index";
	}
	
	
}
