package com.kamil.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.kamil.bo.VaccineDetails;
import com.kamil.dao.IVaccineRepo;

@Service
public class VaccineManagementImpl implements IVaccineManagement {
	
	@Autowired
	private IVaccineRepo repo;

	@Override
	public List<VaccineDetails> searchByCompanyName(String companyName) {
		System.out.println("My custom method implemented by " + repo.getClass().getName());
		
		return repo.findByCompanyName(companyName);
		
	}

	@Override
	public List<VaccineDetails> searchByVaccinePrice(Integer vaccinePrice) {
		System.out.println("Searching by price!");
		return repo.findByVaccinePrice(vaccinePrice);
	}

	@Override
	public List<VaccineDetails> searchByVaccineName(String vaccineName) {
		System.out.println("Searching by company name!");
		
		return repo.findByVaccineName(vaccineName);
		
	}

	@Override
	public List<VaccineDetails> searchByPriceLessThan(Integer vaccinePrice) {
		
		System.out.println("Price less than");
		return repo.findByVaccinePriceLessThan(vaccinePrice);
		
	}

	@Override
	public List<VaccineDetails> searchByVaccineNameInAndPriceBetween(Collection<String> vaccines, Integer minPrice,
			Integer maxPrice) {
		return repo.findByVaccineNameInAndVaccinePriceBetween(vaccines, minPrice, maxPrice);
		
	}





}
