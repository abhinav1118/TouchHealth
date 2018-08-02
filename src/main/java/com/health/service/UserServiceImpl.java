package com.health.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.health.controller.UserControllerImpl;
import com.health.dao.UserDao;
import com.health.pojo.User;
import com.health.validation.Validation;
import org.apache.log4j.Logger;

public class UserServiceImpl  implements UserService{
	final static Logger logger = Logger.getLogger(UserServiceImpl.class);

	@Autowired
	private UserDao userdao;
	@Autowired
	private Validation val;
	
	public String RegisterUser(User user) {
		System.out.println("Entered Into RegisterUser:servce");
		if(val.isValidEmail(user.getEmail())) {
			 Integer registerUser = userdao.RegisterUser(user);
		}
		System.out.println("Entered Into RegisterUser::Userservice");

		return "home";
	}
}
