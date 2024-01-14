package com.kamil.service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

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

	@Override
	public Long numberOfRecordInDB() {
		return repo.count();
	}

	@Override
	public boolean checkAvailavility(Long id) {
		return repo.existsById(id);
	}

	@Override
	public Iterable<VaccineDetails> getAllVaccines() {
		return repo.findAll();
	}

	@Override
	public Iterable<VaccineDetails> getAllVaccinesById(Iterable<Serializable> listOfIds) {
		return repo.findAllById(listOfIds); 		
	}

	@Override
	public Optional<VaccineDetails> getVaccineByID(Serializable id) {
		return repo.findById(id);
//		return Optional.empty();
	}

	@Override
	public String deleteVaccineById(Serializable id) {
//		repo.deleteById(id);
//		System.out.println("The position with id=" + id + " has been removed from DB");
		if (repo.findById(id).isPresent()){
			repo.deleteById(id);
			return "The position with id=" + id + " has been removed from DB";
		}else
			return "No object of ID=" + id + " available in the DB";
	}

	@Override
	public String deleteVaccinesByIds(List<Serializable> ids) {
		
		List<VaccineDetails> tst = (List<VaccineDetails>)getAllVaccinesById(ids);
		tst.forEach(vaccine->System.out.println("ready to be deleted:" + vaccine));
		repo.deleteAllById(ids);
		ids.forEach(number->System.out.println("Record with id: " + number + " has been deleted"));


		return "Deletion process has been completed";
	}
	
	//tomorrow -> write above method in s transactional manner-> all or nothing

	@Override
	public String deleteVaccinesByObject(VaccineDetails vaccine) {
		// TODO Auto-generated method stub
		return null;
	}
	



	
	

}
