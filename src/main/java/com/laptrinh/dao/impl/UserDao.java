package com.laptrinh.dao.impl;

import java.util.List;

import com.laptrinh.dao.IUSerDao;
import com.laptrinh.mapper.UserMapper;
import com.laptrinh.model.UserModel;

public class UserDao extends AbstractDao<UserModel> implements IUSerDao {

	public UserDao()
	{
		
	}
	@Override
	public List<UserModel> findAll() {
		String sql = "SELECT * FROM hotelbookingdb.user";
		return query(sql,new UserMapper());
	}
	
}
