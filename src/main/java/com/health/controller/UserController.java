package com.health.controller;

import com.health.pojo.Doctor;
import com.health.pojo.User;

public interface UserController {
	
	public String RegisterUser(User user);
	
	public String RegisterDoctor(Doctor doctor);

}
