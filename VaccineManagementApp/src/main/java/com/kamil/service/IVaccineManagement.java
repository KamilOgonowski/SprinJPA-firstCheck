package com.kamil.service;

import com.kamil.bo.VaccineDetails;

public interface IVaccineManagement {
	public String registerVaccineDetails(VaccineDetails vaccine);
	public Iterable<VaccineDetails> registerMultipleVaccineDetails(Iterable<VaccineDetails>  vaccineList);
	
	

}
