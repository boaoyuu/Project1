package com.insurance.dao;

import org.apache.ibatis.annotations.Param;
import com.insurance.entity.User;

public interface UserDao
{
	
/*
	User queryUserById(long id);
	
	int delUser(User user);

	List<User> getAllUser();
	
	int updateUser(User user);
*/	
	
	Object findUser(String userName);
	
	//根据用户名和密码查找。mybatis中有多个参数时，需要使用@Param注解
    User findByUserNameAndPassword(@Param("userName")String username,@Param("userPwd")String password);
    
    int addUser(User user);
	
}
