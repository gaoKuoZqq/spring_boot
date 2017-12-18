package com.sb.service;

import com.sb.entity.User;

public interface IUserService {
	
	public User findUserByName(String name);
	
	public User query();

}
