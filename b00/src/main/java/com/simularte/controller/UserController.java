package com.simularte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@RequestMapping("toLogin")
	public String toLogin(){
		return "login";
	}
}
