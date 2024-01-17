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
		
		service.fetchVaccineByCompanyName("Sputnik").forEach(v->System.out.println(v));
		
		System.out.println("***************************");
		service.fetchVaccineByCompanies("Some Company", "Sputnik").forEach(c->System.out.println(c));
////		
		System.out.println("***************************");
		service.fetchVaccineByPriceRange(4000, 40000).forEach(v->System.out.println(v));
//
		System.out.println("***************************");
		service.fetchVaccineDetailByVaccineName("Sputnik", "Some Vaccine").forEach(v->System.out.println(v));

		context.close();
//		
	}

}
