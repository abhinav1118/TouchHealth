package com.health.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.health.pojo.User;
import com.health.service.UserService;

@Controller
public class UserControllerImpl implements UserController{
 
	@Autowired
	private  UserService userservice;
	
	@RequestMapping(value = "/regUser", method = RequestMethod.POST)
	public String RegisterUser(User user) {
		System.out.println(user.getMobilenumber());
		System.out.println("Entered Into RegisterUser::UserController");
		String registerUser = userservice.RegisterUser(user);
		return registerUser;
	}

}
