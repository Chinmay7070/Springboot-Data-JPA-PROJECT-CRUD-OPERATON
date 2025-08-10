package com.nt.Runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.nt.Service.ICoronaVaccineManagementService;


@Component
public class CrudRepoTestRunner implements CommandLineRunner {
    
	@Autowired
	private ICoronaVaccineManagementService service;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		try {
//			  
//			  CoronaVaccine vaccine = new CoronaVaccine(null,"Covaxin","Bharat-biiotech","India",780.0,2);
//			  System.out.println(service.RegisterVaccine(vaccine));
//		  }catch(DataAccessException daa) {
//			  daa.printStackTrace();
//		  }
		  
		 //BATCH INSERTION
		//Arrays.asList pan aapan use karu shakato List.of chyea jagi..... java old feature aahe . Returns the mutable list collection object 
//		try {
//			Iterable<CoronaVaccine> listvaccine = service.registerinBatch(List.of(new CoronaVaccine(1L,"sptnik","Russie","Russia",567.6,2),new CoronaVaccine(2L,"sptnik","Russie","Russia",567.6,2)));
//			listvaccine.forEach(vaccine->System.out.print(vaccine.getRegNo()));
//		}
//		catch(DataAccessException daa) {
//			daa.printStackTrace();
//		}
		
//		try {
//			System.out.println("RECORDS COUNT :"+service.getVaccinesCount());
//		}catch(DataAccessException daa) {
//			daa.printStackTrace();
//		}
		
		
//		try {
//			System.out.println("21 regNo vaccine avalible ? ::"+service.checkVaccineAvalablByrRegNo(21));
//		}catch(DataAccessException daa){
//			daa.printStackTrace();
//		}
		
//		try {
//		Iterable<CoronaVaccine> ilist = service.fetchAllDetials();
//		ilist.forEach(vaccine->{      //for each with lambda
//			System.out.println(vaccine);
//		});
//		}
//		catch(DataAccessException dae) {
//			dae.printStackTrace();
//		}
		
//		System.out.println("===========findalbyid methos ====");
//		try {
//			Iterable<CoronaVaccine> ilist = service.fetchAllDetailsbyId(List.of(21L,22L,23L));
//			ilist.forEach(vaccine->{      //for each with lambda
//				System.out.println(vaccine);
//			});
//			}
//			catch(DataAccessException dae) {
//				dae.printStackTrace();
//			}
		
		
//		System.out.println("===========findbyid() method======");
//		try {
//		Optional<CoronaVaccine> opt = service.fetchVaccineById(22L);
//		if(opt.isPresent()) {
//			System.out.println(opt.get());
//		}
//		else {
//			  System.out.println("REcord are not found ");
//		}
//		}catch(DataAccessException dae) {
//			dae.printStackTrace();
//		}
		//Alternate aahe 
		
		//CoronaVaccine vaccine = service.fetchVaccineById(22L).orElseThrow(()->new IllegalArgumentException("NOT AVALIABLE"));
		//System.out.println(vaccine);
		System.out.println("======================");
		
//		System.out.println("=======DELETE OPERATION ======USING DELETEBYID MEHOD");
//		try {
//			System.out.println(service.removeVaccineById(22L));
//		}
//		catch(DataAccessException dae) {
//			dae.printStackTrace();
//		}
		
		System.out.println("=======DELETE OPERATION ======USING DELETEBYID MEHOD");
//		try {
//			CoronaVaccine vaccine = new CoronaVaccine();
//			vaccine.setRegNo(23L);
//			System.out.println(service.removeVaccineByObject(vaccine));
//		}
//		catch(DataAccessException dae) {
//			dae.printStackTrace();
//		}
		
		try {
			System.out.println(service.removeAllVaccine());
		}catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		
		
	}

}
