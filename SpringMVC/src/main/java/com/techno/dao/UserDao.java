package com.techno.dao;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.techno.model.User;

@Repository
public class UserDao {
	
	@Autowired
	private HibernateTemplate template;
	
	@Transactional
	public int saveUser(User user) 
	{
		int result = (Integer) template.save(user);
		return result;
		
	}
	

	@Transactional
	public void updateUser(User user) {

		template.saveOrUpdate(user);

	}

	@Transactional
	public void deleteUser(User user) {

		template.delete( user);

	}

	public User getUser(int id) {

		User user  = template.get(User.class, id);

		return  user;

	}

	public List<User> getAllUser() {

		List<User> user = template.loadAll(User.class);

		return user;

	}


}
