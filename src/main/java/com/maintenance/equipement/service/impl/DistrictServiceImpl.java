package com.maintenance.equipement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maintenance.equipement.model.District;
import com.maintenance.equipement.repository.DistrictRepository;
import com.maintenance.equipement.service.DistrictService;

@Service
public class DistrictServiceImpl implements DistrictService{
    
	@Autowired
	DistrictRepository repository;
	
	
	@Override
	public Optional<District> findOne(Long id) {
		return repository.findById(id);
	}

	@Override
	public List<District> findAll() {
		return repository.findAll();
	}

	@Override
	public void save(District district) {
		repository.save(district);
		
	}

	@Override
	public void update(District district) {
		repository.save(district);
		
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}

	@Override
	public void delete(District district) {
		repository.delete(district);
	}

}
