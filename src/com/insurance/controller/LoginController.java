package com.insurance.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.insurance.entity.User;
import com.insurance.service.UserService;

@Controller
public class LoginController
{
	@Autowired
	private UserService userService;

	@ResponseBody
	@RequestMapping(value = "/userlogin.do", produces = "application/json;charset=UTF-8")
	public Object login(String userName, String userPwd, HttpSession session)
	{
		System.out.println("userName: " + userName);
		System.out.println("userPwd: " + userPwd);
		User user = userService.login(userName, userPwd);
		Map<String, Object> map = new HashMap();

		if (user != null)
		{
			//将user对象设置到HttpSession作用范围域中
			session.setAttribute("user", user);
			//登录成功，返回result=1
			map.put("result", 1);
		} else
		{
			//登录失败返回flag=-1
			map.put("result", -1);
		}
		return map;
	}

	/**
     * 用户注册
     */
	@ResponseBody
    @RequestMapping(value="/userregister.do",method=RequestMethod.POST)
    public Object register(User user) 
    {
		System.out.println("user: " + user);

		Map<String, Object> map = new HashMap();
    	
        String userName = user.getUserName();
        // 如果数据库中没有该用户，可以注册，否则跳转页面
        if (userService.findUser(userName) == null) 
        {
            userService.register(user);
			map.put("result", 1);
			map.put("msg", "注册成功!");

        }else 
        {
        	//注册失败
			map.put("result", -1);
			map.put("msg", "注册失败!");
        }
		return map;
    }
}
