package com.kamil.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.kamil.ResultView;
import com.kamil.bo.VaccineDetails;
import com.kamil.dao.IVaccineRepo;

@Service
public class VaccineManagementImpl implements IVaccineManagement {
	
	@Autowired
	private IVaccineRepo repo;

	@Override
	public List<ResultView> fetchedByPriceLessThan(Integer vaccinePrice) {
		System.out.println("Implementation of my repo " + repo.getClass().getName());
		return repo.findByVaccinePriceLessThan(6000);
	}

	





}
