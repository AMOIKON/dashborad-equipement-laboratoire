package com.maintenance.equipement.service;

import java.util.List;
import java.util.Optional;

import com.maintenance.equipement.model.Pmo;



public interface PmoService {
	Optional<Pmo> findOne(Long id);
	List <Pmo> findAll();
	void save (Pmo pmo);
	void update (Pmo pmo);
	void delete(Long id);
	void delete(Pmo pmo);
}
