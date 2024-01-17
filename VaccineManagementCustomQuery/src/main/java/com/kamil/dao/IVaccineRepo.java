package com.kamil.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kamil.bo.VaccineDetails;
@Repository // optional annotation
public interface IVaccineRepo extends JpaRepository<VaccineDetails, Long>{
	
//	2 approaches same result:
	
	@Query("FROM VaccineDetails WHERE companyName=:company")
	public List<VaccineDetails> searchVaccineByCompanyName(String company);   //custom name - what I want I can call it -> same param name - company, no need to use @Param
	
//	@Query("FROM VaccineDetails WHERE companyName=:company")
//	public List<VaccineDetails> searchVaccineByCompanyName(@Param("company")String vc); // company !+ vc so @Param
	
	@Query("FROM VaccineDetails WHERE companyName IN(:cmp1, :cmp2)")
	public List<VaccineDetails> searchVaccineByCompanies(String cmp1, String cmp2);
//	
//	@Query("FROM VaccineDetails WHERE vaccineCompany IN(:min, :max)")
	@Query("SELECT vaccineName, companyName,vaccinePrice  FROM VaccineDetails WHERE vaccinePrice BETWEEN :min AND :max")
	public List<String> searchVaccineByPriceRange(Integer min, Integer max);
//	
	@Query("SELECT vaccineName, vaccinePrice  FROM VaccineDetails WHERE vaccineName IN(:vac1, :vac2)")
	public List<Object[]> searchVaccineDetailByVaccineName(String vac1, String vac2);

}


