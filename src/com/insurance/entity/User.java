package com.insurance.entity;

public class User
{
	private Integer userId;

	private String userName;

	private String userPwd;

	private String userEmail;

	private String userPhone;
	
	@Override
	public String toString() {
		return "User{" +
				"userId='" + userId + '\'' +
				", userName=" + userName +
				", userPwd='" + userPwd + '\'' +
				", userEmail='" + userEmail + '\'' +
	            ", userPhone='" + userPhone + '\'' +
				'}';
	}

	public Integer getUserId()
	{
		return userId;
	}

	public void setUserId(Integer userId)
	{
		this.userId = userId;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getUserPwd()
	{
		return userPwd;
	}

	public void setUserPwd(String userPwd)
	{
		this.userPwd = userPwd;
	}

	public String getUserEmail()
	{
		return userEmail;
	}

	public void setUserEmail(String userEmail)
	{
		this.userEmail = userEmail;
	}

	public String getUserPhone()
	{
		return userPhone;
	}

	public void setUserPhone(String userPhone)
	{
		this.userPhone = userPhone;
	}
}
