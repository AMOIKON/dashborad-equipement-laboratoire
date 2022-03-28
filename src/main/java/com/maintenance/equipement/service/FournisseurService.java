package com.maintenance.equipement.service;

import java.util.List;
import java.util.Optional;

import com.maintenance.equipement.model.Fournisseur;

public interface FournisseurService {
	Optional<Fournisseur>findOne(Long id);
	List <Fournisseur> findAll();
	void save(Fournisseur fournisseur);
	void update (Fournisseur fournisseur);
	void delete (Long id);
	void delete(Fournisseur fournisseur);
	

}
