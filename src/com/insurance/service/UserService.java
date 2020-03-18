package com.insurance.service;

import java.util.List;

import com.insurance.entity.User;

public interface UserService
{
	
	Object findUser(String userName);
	
	User login(String userName, String userPwd);
	
	int register(User user);
	
}
