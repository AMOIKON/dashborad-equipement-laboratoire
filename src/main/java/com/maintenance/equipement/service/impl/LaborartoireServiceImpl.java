package com.maintenance.equipement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maintenance.equipement.model.Laboratoire;
import com.maintenance.equipement.repository.LaboratoireRepository;
import com.maintenance.equipement.service.LaboratoireService;

@Service
public class LaborartoireServiceImpl implements LaboratoireService {

@Autowired
	
	LaboratoireRepository repository;
	
	@Override
	public Optional<Laboratoire>findOne(Long id) {
		
		return repository.findById(id);
	}

	@Override
	public List<Laboratoire> findAll() {
		return repository.findAll();
	}

	@Override
	public void save(Laboratoire laboratoire) {
	 repository.save(laboratoire);
		
	}

	@Override
	public void update(Laboratoire laboratoire) {
		repository.save(laboratoire);
		
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}

	@Override
	public void delete(Laboratoire laboratoire) {
		repository.deleteAll();
		
	}

}
