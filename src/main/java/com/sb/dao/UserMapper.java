package com.sb.dao;

import com.sb.entity.User;
public interface UserMapper {
	public User query();

	public User queryBy(Integer id, String name);
}
