package com.kamil.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
	
	@Query("Select companyName, vaccineName From VaccineDetails WHERE vaccinePrice<:price")
	public List<String> searchVaccineAndCompanyNameWithPriceLessThan(int price);
	
	@Transactional
	@Modifying
	@Query("UPDATE VaccineDetails SET vaccinePrice=:newPrice WHERE vaccineName=:vaccineName")
	public int updatePriceByVaccine(int newPrice, String vaccineName);
	
	
	
	@Transactional
	@Modifying
	@Query("DELETE VaccineDetails WHERE vaccineName=:vaccineName")
	public int deleteVaccineByVaccineName(String vaccineName);
	
	@Transactional
	@Modifying
	@Query(value="INSERT INTO `vaccine details` (`vaccine_price`, `company_name`, `vaccine name`) VALUES (?,?,?)", nativeQuery=true)
	public int insertVaccine(Integer vaccinePrice, String companyName, String vaccineName);
	
	
	
 
}


