package com.laptrinh.dao;

import java.util.List;

import com.laptrinh.model.UserModel;

public interface IUSerDao extends genericDao<UserModel>  {
	List<UserModel> findAll();
}
