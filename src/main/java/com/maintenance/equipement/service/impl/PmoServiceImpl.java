package com.maintenance.equipement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.maintenance.equipement.model.Pmo;
import com.maintenance.equipement.repository.PmoRepository;
import com.maintenance.equipement.service.PmoService;

@Service
public class PmoServiceImpl implements PmoService
{
	@Autowired
	
	PmoRepository repository;
	
	@Override
	public Optional<Pmo>findOne(Long id) {
		
		return repository.findById(id);
	}

	@Override
	public List<Pmo> findAll() {
		return repository.findAll();
	}

	@Override
	public void save(Pmo pmo) {
	 repository.save(pmo);
		
	}

	@Override
	public void update(Pmo pmo) {
		repository.save(pmo);
		
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}

	@Override
	public void delete(Pmo pmo) {
		repository.deleteAll();
		
	}

}


