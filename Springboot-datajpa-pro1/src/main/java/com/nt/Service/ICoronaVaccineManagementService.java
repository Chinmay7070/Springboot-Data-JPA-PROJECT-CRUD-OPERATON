package com.nt.Service;

import java.util.List;
import java.util.Optional;

import com.nt.Entity.CoronaVaccine;

public interface ICoronaVaccineManagementService {
	
	//Implement kelelyea class madhye aahe methods 
      
	  //INSERT METHOD IN CRUD REPO
	   public String RegisterVaccine(CoronaVaccine vaccine);
	   public Iterable<CoronaVaccine> registerinBatch(Iterable<CoronaVaccine> vaccines );
	   
	   //SELECT method in Crud repo
	   public long getVaccinesCount();
	   public boolean checkVaccineAvalablByrRegNo(long regNo);
	   public Iterable<CoronaVaccine> fetchAllDetials();
	   public Iterable<CoronaVaccine> fetchAllDetailsbyId(List<Long> ids);
	   public Optional<CoronaVaccine> fetchVaccineById(Long regNo);
	   
	   //Delete method in Crud repo Three methods aahe 
	   
	   public String removeVaccineById(Long id);
	   public String removeVaccineByObject(CoronaVaccine vaccine);
	   public String removeAllVaccine();
	  
	  
}
