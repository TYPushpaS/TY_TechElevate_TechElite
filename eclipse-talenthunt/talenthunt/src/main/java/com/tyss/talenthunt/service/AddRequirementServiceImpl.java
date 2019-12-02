package com.tyss.talenthunt.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.tyss.talenthunt.dto.AddRequirement;

public class AddRequirementServiceImpl implements AddRequirementServiceInterface {
    @Autowired
	private AddRequirementDao dao;
	
	@Override
	public boolean addRequirement(AddRequirement requirement) {
		
		return false;
	}

	@Override
	public boolean updateRequirement(AddRequirement requirement) {
		return false;
	}


}
