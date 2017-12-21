package com.sb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.dao.UserMapper;
import com.sb.entity.User;
import com.sb.repositoty.UserRepositoty;
import com.sb.service.IUserService;
@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	private UserRepositoty userRepositoty;
	@Autowired
	private UserMapper userMapper;
	
    public User findUserByName(String name){
        User user = null;
        try{
            user = userRepositoty.findByUserName(name);
        }catch (Exception e){}
        return user;
    }

	@Override
	public User query() {
		return userMapper.query();
	}

	@Override
	public User queryBy(Integer id, String name) {
		return userMapper.queryBy(id,name);
	}
}
