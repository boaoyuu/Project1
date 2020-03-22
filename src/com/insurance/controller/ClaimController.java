package com.insurance.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.insurance.entity.Claim;
import com.insurance.service.ClaimService;

@Controller
public class ClaimController
{
    @Autowired
    private ClaimService claimService;
    
	@ResponseBody
	@RequestMapping(value = "/saveClaim.do", method = RequestMethod.POST)
    public Object saveClaim(Claim claim)
    {
		System.out.println("enter saveClaim....");

		int result = claimService.saveClaim(claim);
		
		Map<String, Object> map = new HashMap();
		
		map.put("result", result);
		
		return map;
    }
	
	@RequestMapping(value = "/hello11")
	public String hello()
	{
		System.out.println("enter controller......");
		return "index";
	}
}
