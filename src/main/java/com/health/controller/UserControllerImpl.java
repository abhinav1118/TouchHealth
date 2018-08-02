package com.health.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.health.pojo.Doctor;
import com.health.pojo.User;
import com.health.service.UserService;
import org.apache.log4j.Logger;

@Controller
public class UserControllerImpl implements UserController {
	final static Logger logger = Logger.getLogger(UserControllerImpl.class);

	@Autowired
	private UserService userservice;

	@RequestMapping(value = "/regUser", method = RequestMethod.POST)
	public String RegisterUser(User user) {

		logger.info("Entered Into RegisterUser::UserController");
		String registerUser = userservice.RegisterUser(user);
		return registerUser;
	}

	public String RegisterDoctor(Doctor doctor) {
		
		logger.info("Entered into RegisterDoctor:: UserController");
		String registerDoctor = userservice.RegisterDoctor(doctor);
	
		return registerDoctor;
	}

}
