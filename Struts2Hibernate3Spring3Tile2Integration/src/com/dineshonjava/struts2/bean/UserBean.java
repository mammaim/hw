package com.dineshonjava.struts2.bean;

import java.io.Serializable;

/**
 * @author mammaim
 * 
 */
public class UserBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String userName;
	private Long userAge;
	private String userGender;
	private String userJob;
	private String[] userHobbies;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getUserAge() {
		return userAge;
	}

	public void setUserAge(Long userAge) {
		this.userAge = userAge;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserJob() {
		return userJob;
	}

	public void setUserJob(String userJob) {
		this.userJob = userJob;
	}

	public String[] getUserHobbies() {
		return userHobbies;
	}

	public void setUserHobbies(String[] userHobbies) {
		this.userHobbies = userHobbies;
	}

}
