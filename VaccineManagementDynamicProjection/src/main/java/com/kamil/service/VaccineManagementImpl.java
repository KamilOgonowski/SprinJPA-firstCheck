package com.kamil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamil.dao.IVaccineRepo;
import com.kamil.view.View;

@Service
public class VaccineManagementImpl implements IVaccineManagement {
	
	@Autowired
	private IVaccineRepo repo;

	@Override
	public <T extends View> List<T> fetchByCompanyName(String companyName, Class<T> cls) {
		
		return repo.findByCompanyName(companyName, cls);
	}

	



	





}
