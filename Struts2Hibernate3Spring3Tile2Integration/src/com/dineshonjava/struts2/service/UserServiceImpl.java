package com.dineshonjava.struts2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dineshonjava.struts2.dao.UserDao;
import com.dineshonjava.struts2.model.User;

/**
 * @author mammaim
 *
 */
@Service("userService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true) 
public class UserServiceImpl implements UserService
{

	@Autowired
	private UserDao userDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)  
	public void saveUser(User user) {
		userDao.saveUser(user);
	}

	public List<User> getUserList() {
		return userDao.getUserList();
	}

}
