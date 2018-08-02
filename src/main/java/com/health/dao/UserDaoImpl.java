package com.health.dao;

import java.io.Serializable;

import org.hibernate.Session;

import com.health.pojo.User;
import com.health.utility.HibernateUtility;

public class UserDaoImpl implements UserDao {

	public Integer RegisterUser(User user) {
		System.out.println("Entered Into RegisterUser::UserDAo");
		Session session = HibernateUtility.getSessionFactory().openSession();
		
		Serializable save = session.save(user);
		session.beginTransaction().commit();
		return (Integer) save;
	
	}
}
