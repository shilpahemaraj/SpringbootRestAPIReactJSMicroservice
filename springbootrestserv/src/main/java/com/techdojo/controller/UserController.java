package com.techdojo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping("/")
	String loginAccess() {
		System.out.println("Entering UserController::loginAccess");
		return "login_page";
	}
}
