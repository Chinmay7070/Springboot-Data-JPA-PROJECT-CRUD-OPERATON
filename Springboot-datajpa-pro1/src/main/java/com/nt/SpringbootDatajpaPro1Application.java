package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.Entity.CoronaVaccine;
import com.nt.Service.ICoronaVaccineManagementService;

@SpringBootApplication
public class SpringbootDatajpaPro1Application {

	public static void main(String[] args) {
	  ApplicationContext ctx =	SpringApplication.run(SpringbootDatajpaPro1Application.class, args);
//	  ICoronaVaccineManagementService service = ctx.getBean("vaccineservice", ICoronaVaccineManagementService.class);
//	 
//	  
//	  try {
//		  
//		  CoronaVaccine vaccine = new CoronaVaccine(null,"Covaxin","Bharat-biiotech","India",780.0,2);
//		  System.out.println(service.RegisterVaccine(vaccine));
//	  }catch(DataAccessException daa) {
//		  daa.printStackTrace();
//	  }
//	  
//	  ((ConfigurableApplicationContext) ctx).close();
//	  
	}

}
