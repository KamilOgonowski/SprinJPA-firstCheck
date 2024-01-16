package com.kamil.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.kamil.bo.VaccineDetails;

public interface IVaccineManagement {

	public List<VaccineDetails> searchByCompanyName (String companyName);
	public List<VaccineDetails> searchByVaccineName (String vaccineName);
	public List<VaccineDetails> searchByVaccinePrice (Integer vaccinePrice);
	public List<VaccineDetails> searchByPriceLessThan (Integer vaccinePrice);
	public List<VaccineDetails> searchByVaccineNameInAndPriceBetween(Collection<String> vaccines, Integer minPrice, Integer maxPrice);
	


}
