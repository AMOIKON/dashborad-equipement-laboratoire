package com.maintenance.equipement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maintenance.equipement.model.Acte;
import com.maintenance.equipement.repository.ActeRepository;

import com.maintenance.equipement.service.ActeService;

@Service
public class ActeServiceImpl implements ActeService{

@Autowired
	
	ActeRepository repository;
	
	@Override
	public Optional<Acte>findOne(Long id) {
		
		return repository.findById(id);
	}

	@Override
	public List<Acte> findAll() {
		return repository.findAll();
	}

	@Override
	public void save(Acte acte) {
	 repository.save(acte);
		
	}

	@Override
	public void update(Acte acte) {
		repository.save(acte);
		
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}

	@Override
	public void delete(Acte acte) {
		repository.deleteAll();
		
	}
}
