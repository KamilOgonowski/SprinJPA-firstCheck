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
		
		VaccineDetails vaccine = new VaccineDetails("AstraZeneca", "No Pain no Gain", 45478);
		String message = service.registerVaccineDetails(vaccine);
		System.out.println(message);
		
		List<VaccineDetails> vaccineList = new ArrayList<>();
		vaccineList.add(new VaccineDetails("CovidShield", "AstraZeneca", 88789));
		vaccineList.add(new VaccineDetails("Phizer", "Phizer", 444112));
		vaccineList.add(new VaccineDetails("Sputnik", "Sputnik", 46556));
		service.registerMultipleVaccineDetails(vaccineList);
		

		context.close();
	}

}
