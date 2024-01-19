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
	public List<VaccineDetails> fetchVaccineByCompanyName(String company) {
		return repo.searchVaccineByCompanyName(company);
		}

	@Override
	public List<VaccineDetails> fetchVaccineByCompanies(String cmp1, String cmp2) {
		return repo.searchVaccineByCompanies(cmp1, cmp2);
		
	}

	@Override
	public List<String> fetchVaccineByPriceRange(Integer min, Integer max) {
		return repo.searchVaccineByPriceRange(min, max);
	}
//
	@Override
	public List<Object[]> fetchVaccineDetailByVaccineName(String vac1, String vac2) {
		return repo.searchVaccineDetailByVaccineName(vac1, vac2);
	}

@Override
public List<String> fetchVaccineAndCompanyNameWithPriceLessThan(int price) {
		return repo.searchVaccineAndCompanyNameWithPriceLessThan(price);
}


@Override
public int changePriceByVaccine(int newPrice, String vaccineName) {
	return repo.updatePriceByVaccine(newPrice, vaccineName);
	
}

@Override
public int deleteVaccineByVaccineName(String vaccineName) {
	return repo.deleteVaccineByVaccineName(vaccineName);
}

@Override
public int insertVaccineToBd(Integer vaccinePrice, String companyName, String vaccineName) {
	return repo.insertVaccine(vaccinePrice, companyName, vaccineName);
}
	
	







}
