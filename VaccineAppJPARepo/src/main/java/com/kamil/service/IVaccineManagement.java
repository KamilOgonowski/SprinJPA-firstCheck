package com.kamil.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.kamil.bo.VaccineDetails;

public interface IVaccineManagement {

	public List<VaccineDetails> searchVaccineByInput(VaccineDetails vaccine, boolean status, String...args);
	
	public List<VaccineDetails> searchVaccineByGivenObject(VaccineDetails vaccine);

	public VaccineDetails seachVaccineById(Long id);
	
	public String removeVaccineByIds(Iterable<Long> ids);
}
