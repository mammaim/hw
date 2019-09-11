package com.dineshonjava.struts2.dao;

import java.util.List;

import com.dineshonjava.struts2.model.User;

/**
 * @author mammaim
 *
 */
public interface UserDao {
	void saveUser(User user);
	
	List<User> getUserList(); 
}
