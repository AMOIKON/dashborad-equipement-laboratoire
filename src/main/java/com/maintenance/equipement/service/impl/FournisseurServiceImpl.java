package com.maintenance.equipement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maintenance.equipement.model.Fournisseur;
import com.maintenance.equipement.repository.FournisseurRepository;
import com.maintenance.equipement.service.FournisseurService;
@Service
public class FournisseurServiceImpl implements FournisseurService {
	
	@Autowired
	FournisseurRepository repository;
	
	@Override
	public Optional<Fournisseur> findOne(Long id) {
		return repository.findById(id);
	}

	@Override
	public List<Fournisseur> findAll() {
			return repository.findAll();
	}

	@Override
	public void save(Fournisseur fournisseur) {
	repository.save(fournisseur);
		
	}

	@Override
	public void update(Fournisseur fournisseur) {
	 repository.save(fournisseur);
		
	}

	@Override
	public void delete(Long id) {
	 repository.deleteById(id);
		
	}

	@Override
	public void delete(Fournisseur fournisseur) {
	repository.delete(fournisseur);
		
		
	}

}
