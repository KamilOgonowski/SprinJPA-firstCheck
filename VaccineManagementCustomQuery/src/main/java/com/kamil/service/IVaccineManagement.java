package com.kamil.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.kamil.bo.VaccineDetails;

public interface IVaccineManagement {

	public List<VaccineDetails> fetchVaccineByCompanyName(String company); 
	

	public List<VaccineDetails> fetchVaccineByCompanies(String cmp1, String cmp2);
//	
//
	public List<String> fetchVaccineByPriceRange(Integer min, Integer max);
//	
//
	public List<Object[]> fetchVaccineDetailByVaccineName(String vac1, String vac2);
	
	public List<String> fetchVaccineAndCompanyNameWithPriceLessThan(int price);
	

	
	public int changePriceByVaccine(int newPrice, String vaccineName);
	
	public int deleteVaccineByVaccineName(String vaccineName);
	
	public int insertVaccineToBd(Integer vaccinePrice, String companyName, String vaccineName);
	

}
