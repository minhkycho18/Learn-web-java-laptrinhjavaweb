package com.laptrinh.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.laptrinh.model.UserModel;

public class UserMapper implements IRowMapper<UserModel>{

	@Override
	public <T> T MappingRow(ResultSet rs) {
		UserModel user = new UserModel();
		try {
			user.setId(rs.getLong("id"));
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			user.setFullName(rs.getString("fullname"));
			user.setGender(rs.getBoolean("gender"));
			user.setPhoneNumber(rs.getString("phonenumber"));
			user.setEmail(rs.getString("email"));
			user.setRoleId(rs.getLong("roleid"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
