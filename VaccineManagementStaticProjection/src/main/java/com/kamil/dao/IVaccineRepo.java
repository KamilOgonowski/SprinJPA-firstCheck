package com.kamil.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kamil.ResultView;
import com.kamil.bo.VaccineDetails;
@Repository // optional annotation
public interface IVaccineRepo extends JpaRepository<VaccineDetails, Long>{
	
	public List<ResultView>findByVaccinePriceLessThan(Integer vaccinePrice);
	
	

	
	
	

}


