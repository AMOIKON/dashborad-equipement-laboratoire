package com.maintenance.equipement.service;

import java.util.List;
import java.util.Optional;

import com.maintenance.equipement.model.Lieu;

public interface LieuService {

	Optional <Lieu> findOne(Long id);
	List<Lieu>findAll();
	void save(Lieu lieu);
	void update (Lieu lieu);
	void delete(Long id);
	void delete(Lieu lieu);
}
