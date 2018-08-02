package com.health.dao;

import java.io.Serializable;

import org.hibernate.Session;

import com.health.controller.UserControllerImpl;
import com.health.pojo.User;
import com.health.utility.HibernateUtility;
import org.apache.log4j.Logger;

public class UserDaoImpl implements UserDao {
	final static Logger logger = Logger.getLogger(UserDaoImpl.class);

	public Integer RegisterUser(User user) {
		
		Session session = HibernateUtility.getSessionFactory().openSession();
		Serializable save = session.save(user);
		session.beginTransaction().commit();
		return (Integer) save;
	}

}
