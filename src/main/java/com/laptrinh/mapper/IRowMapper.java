package com.laptrinh.mapper;

import java.sql.ResultSet;

public interface IRowMapper<T> {
	<T> T MappingRow(ResultSet rs);
}
