package com.maintenance.equipement.service;

import java.util.List;
import java.util.Optional;

import com.maintenance.equipement.model.Acte;

public interface ActeService {
	Optional<Acte>findOne(Long id);
	List<Acte>findAll();
	void save(Acte acte);
	void delete(Acte acte);
	void delete(Long id);
	void update(Acte acte);

}
