package com.maintenance.equipement.service;

import java.util.List;
import java.util.Optional;

import com.maintenance.equipement.model.District;

public interface DistrictService {
	
	Optional<District> findOne(Long id);
	List <District> findAll();
	void save (District district);
	void update (District district);
	void delete(Long id);
	void delete(District district);
	

}
