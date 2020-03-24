package com.insurance.dao;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.insurance.entity.Claim;
import com.insurance.entity.User;
import com.insurance.service.UserService;

@RunWith(value=SpringJUnit4ClassRunner.class)
@ContextConfiguration(value="classpath:applicationContext.xml")
public class InitTest
{
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private ClaimDao claimDao;
	
	@Autowired
	private UserService userService;

	
	@Test
	@Ignore
	public void testFindUser() 
	{
		Object findUser = userDao.findUser("user9");
		System.out.println("findUser=" + findUser);
	}
	
	@Test
	@Ignore
	public void testlogin() 
	{
		User user = userService.login("user0", "abc000");
		System.out.println("user=" + user);
		System.out.println("user==null? :" + (user==null));
	}

	@Test
	@Ignore
	public void testAdd()
	{
		User user = new User();
		user.setUserName("test3");
		user.setUserPwd("testPwd3");
		user.setUserEmail("test3@test.com");
		user.setUserPhone("45643231");
		
		userDao.addUser(user);
	}
	
	@Test
	public void saveClaimTest()
	{
		Claim claim = new Claim();
		
		claim.setInsuredId("2222");
		claim.setInsuredName("nameeeee");
		
		claimDao.saveClaim(claim);
	}
	
	
}
