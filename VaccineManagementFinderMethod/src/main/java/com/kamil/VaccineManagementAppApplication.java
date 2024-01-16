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
//		VaccineDetails vaccine = new VaccineDetails("CovidShield","AstraZeneca", 88789);
		
//		service.searchByCompanyName("Sputnik").forEach(v->System.out.println(v));
//		service.searchByVaccinePrice(4585).forEach(v->System.out.println(v));
//		service.searchByVaccineName("Some Vaccine").forEach(v->System.out.println(v));
//		service.searchByPriceLessThan(5000).forEach(v->System.out.println("price " + v));
		
		List<String> vaccines = new ArrayList<>();
		vaccines.add("Sputnik");
		vaccines.add("Some Vaccine");
		
		service.searchByVaccineNameInAndPriceBetween(vaccines, 4600, 100000).forEach(v->System.out.println("range and list " + v));

		context.close();
//		
	}

}
