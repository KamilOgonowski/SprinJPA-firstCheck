package com.kamil.service;

import java.util.List;
import java.util.Optional;

import com.kamil.bo.VaccineDetails;

public interface IVaccineManagement {
	public String registerVaccineDetails(VaccineDetails vaccine);
	public Iterable<VaccineDetails> registerMultipleVaccineDetails(Iterable<VaccineDetails>  vaccineList);
	
}
