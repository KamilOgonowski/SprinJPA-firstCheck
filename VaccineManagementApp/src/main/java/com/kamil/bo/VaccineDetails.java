package com.kamil.bo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // to map this class to database - so to create a table there -> if no stated differently the table name will be the same as the class name
@Table(name="VaccineInfo") //changing class name to VaccineInfo
public class VaccineDetails {
	
	@Id
	@Column(name="ID") // just to change the name of the column, otherwise it takes field's name - id 
	private Long id;
	
	@Column(name="VaccineName") 
	private String vaccineName;
	
	private String companyName;
	
	private Integer vaccinePrice;
	
	public VaccineDetails() {
		System.out.println("Vaccine Zero Param Constructor");
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVaccineName() {
		return vaccineName;
	}

	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Integer getVaccinePrice() {
		return vaccinePrice;
	}

	public void setVaccinePrice(Integer vaccinePrice) {
		this.vaccinePrice = vaccinePrice;
	}

	@Override
	public String toString() {
		return "VaccineDetails [id=" + id + ", vaccineName=" + vaccineName + ", companyName=" + companyName
				+ ", vaccinePrice=" + vaccinePrice + "]";
	}

}
