package com.admin.manager;

import javax.inject.Inject;
import javax.inject.Named;

import com.admin.dao.UserDAO;
import com.admin.model.UserModel;

@Named
public class UserManager {

	@Inject
	public UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public void addUser(UserModel model) {
		userDAO.addUser(model);
	}

}