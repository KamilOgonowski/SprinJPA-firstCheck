package com.kamil.service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import com.kamil.bo.VaccineDetails;
import com.kamil.dao.IVaccineRepo;

@Service
public class VaccineManagementImpl implements IVaccineManagement {
	
	@Autowired
	private IVaccineRepo repo;

	@Override
	public Iterable<VaccineDetails> fetchDetails(boolean status, String... properties) { 
		Sort sort = Sort.by(status? Direction.ASC:Direction.DESC, properties);
		return repo.findAll(sort);
	}
	/* parameters which allows passing arguments required to create an object of Sort class, by using static method Sort.by()
	 * -> by(Direction direction, String...properties): Sort
	 * of Sort Class which returns object of Sort class required by 
	 * findAll() method of PagingAndSortingRepository<VaccineDetails, Long>{}. First parameter decides about direction of sorting
	 * true=ASCending, false=DESCending, second parameter varargs provides conditions (fields) based on which the sorting will be 
	 * performed
	 * 
	 * Based on boolean value provided as an argument, there will decision made about Direction - see the ternary operator used later on
	 * As properties we always use the field's name, not the name of column we set in DB(in case we decided to change the default 
	 * approach by using @Column(name="some Name" annotation
	 */

	@Override
	public List<VaccineDetails> fetchDetailsByPgNo(int pgNo, int pgSize, boolean status, String... properties) {
		PageRequest pageable = PageRequest.of(pgNo, pgSize, status?Direction.ASC:Direction.DESC, properties);
		
		Page<VaccineDetails> page = repo.findAll(pageable);
		List<VaccineDetails> list = page.getContent();
		return list;
	}

	@Override
	public void fetchDetailsByPagination(int pageSize) {
		
		long count1 = findAllVaccines().size();
//		long count = 4L; //added by hand based on the amount in the DB. In next project use it together with methods of CrudRepository to take the data from DB
		long pagesCount =count1/pageSize;
		pagesCount = count1%pageSize == 0?pagesCount:++pagesCount;
		
		for(int i=0; i<pagesCount; i++) {
			PageRequest fakePegeable = PageRequest.of(i, pageSize);
			Page<VaccineDetails> page = repo.findAll(fakePegeable);
			page.getContent().forEach(vaccine -> System.out.println(vaccine.getVaccineName() +" => " + vaccine.getCompanyName()));

			System.out.println("Page number: " + (page.getNumber()+1) + " of " + page.getTotalPages() + " total. \n" );
		}
	}

	@Override
	public List<VaccineDetails> findAllVaccines() {
		return (List<VaccineDetails>)repo.findAll();
	}
	@Override
	public boolean addVaccine(VaccineDetails vaccine) {
		
		int before = findAllVaccines().size();
		repo.save(vaccine);
		int after = findAllVaccines().size();
		
		System.out.println(before<after?"New Vacine: "+ vaccine.getVaccineName()+" has been added to DB: " :"Fail to update");
		return before<after?true:false;
	}
	
	
	
	
	

//	@Override
//	public String registerVaccineDetails(VaccineDetails vaccine) {
//		System.out.println("Implementing class of IVaccineRepo is: " + repo.getClass().getName());
//		VaccineDetails v = repo.save(vaccine);
//		return "Vaccine Details register with ID: " +v.getId();
//	}
//
//	@Override
//	public Iterable<VaccineDetails> registerMultipleVaccineDetails(Iterable<VaccineDetails> vaccineList) {
//		return repo.saveAll(vaccineList);
//	}


}
