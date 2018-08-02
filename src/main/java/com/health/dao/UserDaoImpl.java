package com.health.dao;

import org.hibernate.Session;

import com.health.utility.HibernateUtility;

public class UserDaoImpl implements UserDao {

	public void RegisterUser() {
		
		Session session = HibernateUtility.getSessionFactory().openSession();
		
		
	}

}
