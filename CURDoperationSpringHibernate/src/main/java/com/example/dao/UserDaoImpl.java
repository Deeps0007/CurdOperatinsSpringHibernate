package com.example.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.model.User;

@Repository
public class UserDaoImpl  implements UserDao{

	@Autowired
	private SessionFactory factory;
	
	public void addUser(User user) {
		
		factory.getCurrentSession().saveOrUpdate(user);
		
	}

	@SuppressWarnings("unchecked")
	public List<User> getAllUsers() {
		
		return factory.getCurrentSession().createQuery("from User").list() ;
	}

	public User updateUser(User user) {
		
		 factory.getCurrentSession().update(user);
		 return user;
	}

	public User getUser(int id) {
		
		User u= (User)factory.getCurrentSession().get(User.class, id);
	
		return u;
	}

	public void deleteUser(Integer id) {

	   User	u= (User)factory.getCurrentSession().load(User.class, id);
	   if(null!=u)
	   {
		   this.factory.getCurrentSession().delete(u);
	   }
		
	}


          
	
	
	

}
