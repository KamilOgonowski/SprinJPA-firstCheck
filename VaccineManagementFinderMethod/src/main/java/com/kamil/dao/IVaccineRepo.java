package com.kamil.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kamil.bo.VaccineDetails;
@Repository // optional annotation
public interface IVaccineRepo extends JpaRepository<VaccineDetails, Long>{
	
	
	public List<VaccineDetails> findByCompanyName (String companyName);
	
	public List<VaccineDetails> findByVaccinePrice (Integer vaccinePrice);
	
	public List<VaccineDetails> findByVaccineName (String vaccineName);
	
	// findByPropertyFollowedByKeyword
	

	public List<VaccineDetails> findByVaccinePriceLessThan(Integer vaccinePrice);
	
	// between  In -> to get multiple object 
	public List<VaccineDetails> findByVaccineNameInAndVaccinePriceBetween(Collection<String> vaccines, Integer minPrice, Integer maxPrice); 
	
	
	
	
	

}

