package com.laptrinh.dao;

import java.util.List;

import com.laptrinh.mapper.IRowMapper;

public interface genericDao<T> {
	<T> List<T> query(String sql, IRowMapper<T> rowMapper, Object... Parameters); 
}
