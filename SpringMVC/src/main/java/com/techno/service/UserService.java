package com.techno.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techno.dao.UserDao;
import com.techno.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public int saveUser(User user) 
	{
		return userDao.saveUser(user);
		
	}


}
