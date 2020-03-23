package com.insurance.dao;

import com.insurance.entity.Claim;

public interface ClaimDao
{
    int saveClaim(Claim claim);
}
