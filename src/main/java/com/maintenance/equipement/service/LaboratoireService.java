package com.maintenance.equipement.service;

import java.util.List;
import java.util.Optional;

import com.maintenance.equipement.model.Laboratoire;

public interface LaboratoireService {

	Optional<Laboratoire>findOne(Long id);
	List<Laboratoire>findAll();
	void save(Laboratoire laboratoire);
	void update(Laboratoire laboratoire);
	void delete(Laboratoire laboratoire);
	void delete(Long id);
}
