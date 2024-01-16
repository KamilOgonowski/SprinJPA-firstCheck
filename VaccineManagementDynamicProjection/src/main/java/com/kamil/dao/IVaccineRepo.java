package com.kamil.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kamil.bo.VaccineDetails;
import com.kamil.view.View;
@Repository // optional annotation
public interface IVaccineRepo extends JpaRepository<VaccineDetails, Long>{
	
	public <T extends View>List<T>findByCompanyName(String companyName, Class<T> cls);
	
//	super lower
//	extends upper
	
//	this.vaccineName = vaccineName;
//	this.companyName = companyName;
//	this.vaccinePrice = vaccinePrice;
//}
	
	

	
	
	

}


