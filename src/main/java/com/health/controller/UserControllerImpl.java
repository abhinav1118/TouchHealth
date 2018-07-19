package com.health.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserControllerImpl implements UserController{

	@RequestMapping(value = "/regUser", method = RequestMethod.POST)
	public String RegisterUser() {
		System.out.println("Entered Into RegisterUser::UserController");
		
		return "";
	}

}
