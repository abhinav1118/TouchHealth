package com.health.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.apache.log4j.Logger;

@Controller
public class UserControllerImpl implements UserController{
	final static Logger logger = Logger.getLogger(UserControllerImpl.class);
	@RequestMapping(value = "/regUser", method = RequestMethod.POST)
	public String RegisterUser() {
		System.out.println("Entered Into RegisterUser::UserController");
		
		return "";
	}

}
