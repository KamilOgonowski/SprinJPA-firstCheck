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
		VaccineDetails vaccine = new VaccineDetails("CovidShield","AstraZeneca", 88789);
//		service.searchVaccineByInput(vaccine, true, "vaccineName", "companyName").forEach(v->System.out.println(v.getVaccineName() + " : " + v.getCompanyName()));
//	

//		service.searchVaccineByGivenObject(vaccine).forEach(v->System.out.println(v));
		
		
//		spring.jpa.properties.hibernate.enable_lazy_load_no_trans=true		// -> added to application.properties
//		System.out.println(service.seachVaccineById(12L));
		
		
		
		List<Long> ids = new ArrayList<>();
		ids.add(11L);
		ids.add(12L);
		ids.add(13L);
		System.out.println(service.removeVaccineByIds(ids));
		
		
		context.close();
	}

}
