package com.kamil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamil.bo.VaccineDetails;
import com.kamil.dao.IVaccineRepo;

@Service
public class VaccineManagementImpl implements IVaccineManagement {
	
	@Autowired
	private IVaccineRepo repo;

	@Override
	public String registerVaccineDetails(VaccineDetails vaccine) {
		System.out.println("Implementing class of IVaccineRepo is: " + repo.getClass().getName());
		VaccineDetails v = repo.save(vaccine);
		return "Vaccine Details register with ID: " +v.getId();
	}

	@Override
	public Iterable<VaccineDetails> registerMultipleVaccineDetails(Iterable<VaccineDetails> vaccineList) {
		return repo.saveAll(vaccineList);
	}

}
