package com.example.dao;

import java.util.List;

import com.example.model.User;

public interface UserDao {

	
	public void addUser(User user);
	
	public List<User> getAllUsers();
	
	public User updateUser(User user);
	
	public User getUser(int id);
	
	public void deleteUser(Integer id);
	
	
	
}
