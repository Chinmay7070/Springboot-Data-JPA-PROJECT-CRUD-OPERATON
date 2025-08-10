package com.nt.ropo;

import org.springframework.data.repository.CrudRepository;
import org.yaml.snakeyaml.events.Event.ID;

import com.nt.Entity.CoronaVaccine;

public interface ICaronaVaccineRepo extends CrudRepository<CoronaVaccine, Long> {

}
