package com.kamil;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.kamil.bo.VaccineDetails;
import com.kamil.service.VaccineManagementImpl;

@SpringBootApplication
public class VaccineManagementAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(VaccineManagementAppApplication.class, args);
		
		VaccineManagementImpl service = context.getBean(VaccineManagementImpl.class);
		
//		VaccineDetails vaccine = new VaccineDetails("AstraZeneca", "No Pain no Gain", 45478);
//		String message = service.registerVaccineDetails(vaccine);
//		System.out.println(message);
		
//		List<VaccineDetails> vaccineList = new ArrayList<>();
//		vaccineList.add(new VaccineDetails("CovidShield", "AstraZeneca", 88789));
//		vaccineList.add(new VaccineDetails("Phizer", "Phizer", 444112));
//		vaccineList.add(new VaccineDetails("Sputnik", "Sputnik", 46556));
//		service.registerMultipleVaccineDetails(vaccineList);
//		
//		System.out.println("Check your DB");
		
//		System.out.println("The current number of roes in your DB is: " + service.numberOfRecordInDB());
//		Long id = 2L;
//		boolean status = service.checkAvailavility(id);
//		if (status)
//			System.out.println("Vaccine available with id: " + id);
//		else
//			System.out.println("Vaccine not available with id: " + id);
//		
		
		
//		Iterable<VaccineDetails> vaccineInfo = service.getAllVaccines();
//		List<VaccineDetails> vaccineInfotoStream = (List<VaccineDetails>) service.getAllVaccines();
//		vaccineInfotoStream.forEach(vaccine-> System.out.println("Details for id: " + vaccine.getId() + ": " +vaccine));
		
		
		ArrayList<Serializable> listOfId = new ArrayList();
		listOfId.add(3L);
		listOfId.add(1L);
		listOfId.add(2L);
		
		/*
		 * Iterable<VaccineDetails> listBasedOnId =
		 * service.getAllVaccinesById(listOfId); listBasedOnId.forEach(vaccine ->
		 * System.out.println(vaccine));
		 */
		//or second reduced approach - chaining:		
//		service.getAllVaccinesById(listOfId).forEach(vaccine->System.out.println(vaccine));
//		Long id = 9L;
//		Optional<VaccineDetails> optional = service.getVaccineByID(id);
//		if (optional.isPresent()) {
//			VaccineDetails vaccineDetailsId3 = optional.get(); // .get() to take VaccineDetails object out of Optional class
//			System.out.println(vaccineDetailsId3);
//		}else
//			System.out.println("There is no positional with id=" + id);
//	
//		System.out.println("Check with printing of optional type object where the ID is not avaiable: " + optional);
//		service.registerVaccineDetails(new VaccineDetails("Sputnik", "Sputnik", 46556));
//		service.getAllVaccines().forEach(vaccine->System.out.println("CHeck after sputnik has been added " + vaccine));
//		System.out.println(service.deleteVaccineById(5));
//		service.getAllVaccines().forEach(vaccine->System.out.println("CHeck aftere deletion of sputnik" + vaccine));
		
//		
//		service.getAllVaccines().forEach(vaccine->System.out.println("CHeck aftere deletion of sputnik" + vaccine));
//		List<Serializable> listId = new ArrayList<>();
//		listId.add(2);
//		listId.add(7);
//		service.deleteVaccinesByIds(listId);
//		service.getAllVaccines().forEach(vaccine->System.out.println("CHeck aftere deletion of sputnik" + vaccine));
//		
//		System.out.println(service.getVaccineByID(9));
		
//		service.registerVaccineDetails(new VaccineDetails("CovidShield", "AstraZeneca", 88789));
//		service.registerVaccineDetails(new VaccineDetails("Phizer", "Phizer", 444112));
//		service.registerVaccineDetails(new VaccineDetails("Sputnik", "Sputnik", 46556));
		
		

		
		List<Serializable> listka = Arrays.asList(8,10,3);
		
		service.deleteVaccinesByIds(listka);
		System.out.println(listka);
		
		
		

		
		context.close();
	}

}
