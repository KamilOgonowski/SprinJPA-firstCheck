package com.kamil.service;

import java.io.Serializable;
import java.util.Optional;

import com.kamil.bo.VaccineDetails;

public interface IVaccineManagement {
	public String registerVaccineDetails(VaccineDetails vaccine);
	public Iterable<VaccineDetails> registerMultipleVaccineDetails(Iterable<VaccineDetails>  vaccineList);
	public Long numberOfRecordInDB();
	public boolean checkAvailavility (Long id);
	public Iterable<VaccineDetails> getAllVaccines();
	public Iterable<VaccineDetails> getAllVaccinesById(Iterable<Serializable> listOfIds);
	public Optional<VaccineDetails> getVaccineByID(Serializable id);
	
	
	

}
