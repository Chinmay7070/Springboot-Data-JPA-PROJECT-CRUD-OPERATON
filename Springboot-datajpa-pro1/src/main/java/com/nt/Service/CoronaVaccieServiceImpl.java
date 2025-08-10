package com.nt.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Entity.CoronaVaccine;
import com.nt.ropo.ICaronaVaccineRepo;

@Service("vaccineservice")
public class CoronaVaccieServiceImpl implements ICoronaVaccineManagementService {
    @Autowired
    private ICaronaVaccineRepo coronarepo;  
	
	public String RegisterVaccine(CoronaVaccine vaccine) {
		
		CoronaVaccine savedvaccine  = null; 
		
		if(vaccine != null) {
		 savedvaccine = coronarepo.save(vaccine);
		}
		return savedvaccine != null ? "Vaccine registred successfully with"+savedvaccine.getRegNo():"Vaccine registration fail";
	}

	@Override
	public Iterable<CoronaVaccine> registerinBatch(Iterable<CoronaVaccine> vaccines) {
		// TODO Auto-generated method stub
		if(vaccines != null) {
		return coronarepo.saveAll(vaccines);
		}
		else
			throw new IllegalArgumentException("BAtch insertion not done");
	}

	@Override
	public long getVaccinesCount() {
		
		return coronarepo.count();
	}

	@Override
	public boolean checkVaccineAvalablByrRegNo(long regNo) {
		
		return coronarepo.existsById(null);
	}

	@Override
	public Iterable<CoronaVaccine> fetchAllDetials() {
	
		return coronarepo.findAll();
	}

	@Override
	public Iterable<CoronaVaccine> fetchAllDetailsbyId(List<Long> ids) {
		// TODO Auto-generated method stub
		return coronarepo.findAllById(ids);
	}

	@Override
	public Optional<CoronaVaccine> fetchVaccineById(Long regNo) {
		
		return coronarepo.findById(regNo);
	}

	@Override
	public String removeVaccineById(Long id) {
	 Optional <CoronaVaccine> opt = coronarepo.findById(id);
	 
	 if(opt.isPresent()) {
		 coronarepo.deleteById(id);
		 return "RECORD deleted having id ::"+id;
	 }
	 else {
		 return "REcord is not found for deletion ::";
	 }
		
	
	}

	@Override
	public String removeVaccineByObject(CoronaVaccine vaccine) {
		
		Optional <CoronaVaccine> opt = coronarepo.findById(vaccine.getRegNo());
		if(opt.isPresent()) {
			coronarepo.delete(vaccine);
			return "record deleted having id::"+vaccine.getRegNo();
		}
		return "record not found for deletion ";
	}

	@Override
	public String removeAllVaccine() {
		
		Long count = coronarepo.count();
		if(count != 0) {
			coronarepo.deleteAll();
			return count+"No of records are deleted ";
		}
		return "table is empty to delete the records ";
		
	}

	

	

}
