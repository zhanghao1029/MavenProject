package com.zh.service;

import java.util.List;

import com.zh.entity.User;

public interface UserService {

	public void save(User user);
	
	public User find(int id);
	
	public void del(int id);
	 
	public User update(User user);
	 
	public List<User> getAll();
}
