package com.xingjiafeng.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/test")
	public String Test() {
		return "测试";
	}

	@RequestMapping("/getUser")
	public String getUser() {
		
		return "测试";
	}
}
