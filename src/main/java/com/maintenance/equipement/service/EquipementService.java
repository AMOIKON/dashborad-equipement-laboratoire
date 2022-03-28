package com.maintenance.equipement.service;

import java.util.List;
import java.util.Optional;

import com.maintenance.equipement.model.Equipement;

public interface EquipementService {

	Optional<Equipement>findOne(Long id);
	List<Equipement> findAll();
	void save(Equipement laboratoire);
	void update(Equipement laboratoire);
	void delete(Long id);
	void delete(Equipement laboratoire);
}
