package com.sb.dao;

import org.mybatis.spring.annotation.MapperScan;

import com.sb.entity.User;
public interface UserMapper {
	public User query();
}
