package com.dineshonjava.struts2.service;

import java.util.List;

import com.dineshonjava.struts2.model.User;

/**
 * @author mammaim
 *
 */
public interface UserService {
	void saveUser(User user);
	
	List<User> getUserList(); 
}
