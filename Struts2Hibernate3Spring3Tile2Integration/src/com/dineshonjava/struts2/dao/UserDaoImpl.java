package com.dineshonjava.struts2.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dineshonjava.struts2.model.User;

/**
 * @author mammaim
 *
 */
@Repository("userDao")  
public class UserDaoImpl implements UserDao {

	@Autowired  
	private SessionFactory sessionFactory;

	public void saveUser(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
		
	}

	@SuppressWarnings("unchecked")
	public List<User> getUserList() {
		return (List<User>) sessionFactory.getCurrentSession().createCriteria(User.class).list();
	}  
}
