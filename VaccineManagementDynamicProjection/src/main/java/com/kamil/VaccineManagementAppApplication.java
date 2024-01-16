package com.kamil;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.kamil.service.VaccineManagementImpl;
import com.kamil.view.ResultView;
import com.kamil.view.ResultView2;

@SpringBootApplication
public class VaccineManagementAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(VaccineManagementAppApplication.class, args);
		
		VaccineManagementImpl service = context.getBean(VaccineManagementImpl.class);
		List<ResultView2> list1 =service.fetchByCompanyName("Sputnik", ResultView2.class);
		list1.forEach(v->System.out.println(v.getId()+ " : " + v.getVaccineName() + " : " + v.getCompanyName()));
		
		List<ResultView> list2 =service.fetchByCompanyName("Sputnik", ResultView.class);
		list2.forEach(v->System.out.println(v.getCompanyName() + " ---- " + v.getId() ));


	}
}
