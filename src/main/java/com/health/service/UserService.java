package com.health.service;

import com.health.pojo.Doctor;
import com.health.pojo.User;

public interface UserService {

	public String RegisterUser(User user);

	public String RegisterDoctor(Doctor doctor);
}
