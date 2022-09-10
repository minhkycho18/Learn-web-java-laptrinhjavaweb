package com.laptrinh.service.impl;

import java.util.List;
import com.laptrinh.dao.impl.*;
import com.laptrinh.dao.IUSerDao;
import com.laptrinh.model.UserModel;
import com.laptrinh.service.IUserService;

public class UserService implements IUserService {

	public IUSerDao userDao;
	public UserService()
	{
		userDao = new UserDao();
	}
	@Override
	public List<UserModel> findAllUser() {
		List<UserModel> result = userDao.findAll();
		return result;
	}
	
}
