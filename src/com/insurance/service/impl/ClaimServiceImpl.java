package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.dao.ClaimDao;
import com.insurance.entity.Claim;
import com.insurance.service.ClaimService;

@Service
public class ClaimServiceImpl implements ClaimService
{

	@Autowired
	private ClaimDao claimDao;
	
	@Override
	public int saveClaim(Claim claim)
	{
		return claimDao.saveClaim(claim);
	}

}
