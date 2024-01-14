package com.kamil.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.kamil.bo.VaccineDetails;

public interface IVaccineManagement {
//	public String registerVaccineDetails(VaccineDetails vaccine);
//	public Iterable<VaccineDetails> registerMultipleVaccineDetails(Iterable<VaccineDetails>  vaccineList);
	
	public Iterable<VaccineDetails> fetchDetails(boolean status, String... properties);
	public List<VaccineDetails> fetchDetailsByPgNo(int pgNo, int pgSize, boolean status, String... properties );
	public void fetchDetailsByPagination(int pageSize);
	
}
