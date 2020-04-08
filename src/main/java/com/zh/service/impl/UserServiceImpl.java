package com.zh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zh.dao.UserDao;
import com.zh.entity.User;
import com.zh.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao  userDaoImpl;
	
	@Override
	public void save(User user) {
		userDaoImpl.save(user);
	}

	@Override
	public void del(int id) {
		userDaoImpl.del(id);
	}

	@Override
	public User update(User user) {
		return userDaoImpl.update(user);
	}

	@Override
	public List<User> getAll() {
		return userDaoImpl.getAll();
	}

	@Override
	public User find(int id) {
		return userDaoImpl.find(id);
	}

}