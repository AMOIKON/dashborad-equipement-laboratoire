package com.maintenance.equipement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maintenance.equipement.model.Equipement;
import com.maintenance.equipement.repository.EquipementRepository;
import com.maintenance.equipement.service.EquipementService;

@Service
public class EquipementServiceImpl implements EquipementService{
   
	@Autowired
	
	EquipementRepository repository;
	
	@Override
	public Optional<Equipement> findOne(Long id) {
		
		return repository.findById(id);
	}

	@Override
	public List<Equipement> findAll() {
		return repository.findAll();
	}

	@Override
	public void save(Equipement laboratoire) {
	 repository.save(laboratoire);
		
	}

	@Override
	public void update(Equipement laboratoire) {
		repository.save(laboratoire);
		
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}

	@Override
	public void delete(Equipement laboratoire) {
		repository.deleteAll();
		
	}

}
