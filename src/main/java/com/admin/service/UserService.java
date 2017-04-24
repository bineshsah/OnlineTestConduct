package com.admin.service;

import com.admin.dao.UserDAO;
import com.admin.model.UserModel;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by binesh on 4/23/2017.
 */
@Named
public class UserService {

	@Inject
	public UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public void addUser(UserModel model) {
		userDAO.addUser(model);
	}

}