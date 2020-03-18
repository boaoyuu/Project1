package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.dao.UserDao;
import com.insurance.entity.User;
import com.insurance.service.UserService;

@Service
public class UserServiceImpl implements UserService
{

	@Autowired
	private UserDao userDao;
	

	@Override
	public Object findUser(String userName)
	{
		return userDao.findUser(userName);
	}
	
	@Override
    public User login(String userName, String userPwd) 
	{
        return userDao.findByUserNameAndPassword(userName, userPwd);
    }
	
    /**
     * 注册
     * 增加用户
     */
    public int register(User user) 
    {
        return userDao.addUser(user);    
    }

}
