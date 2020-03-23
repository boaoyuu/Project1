package com.insurance.service;

import com.insurance.entity.User;

public interface UserService
{

	Object findUser(String userName);

	User login(String userName, String userPwd);

	int register(User user);

}
