package com.health.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.health.dao.UserDao;
import com.health.pojo.User;
import com.health.validation.Validation;

public class UserServiceImpl  implements UserService{

	@Autowired
	private UserDao userdao;
	@Autowired
	private Validation val;
	
	public String RegisterUser(User user) {
		if(val.isValidEmail(user.getEmail())&&val.isValidMobile(user.getMobileNumber())) {
		Integer registerUser = userdao.RegisterUser(user);
}
		return "home";
	}
}
