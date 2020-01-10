package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.UserDao;
import com.example.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired 
	private UserDao userDao;
	
	
	@Transactional
	public void addUser(User user) {
		
		userDao.addUser(user);
		
	}
		
	@Transactional
	public List<User> getAllUsers() {
		
		return userDao.getAllUsers();
	}

	@Transactional
	public User updateUser(User user) {
	
		return userDao.updateUser(user);
	}

	@Transactional
	public User getUser(int id) {
		
		return userDao.getUser(id);
	}

	@Transactional
	public void deleteUser(Integer id) {
	
		userDao.deleteUser(id);
		
	}
	
	
	

}
