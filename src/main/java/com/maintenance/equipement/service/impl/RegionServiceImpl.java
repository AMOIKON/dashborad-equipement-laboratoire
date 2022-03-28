package com.maintenance.equipement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maintenance.equipement.model.Region;
import com.maintenance.equipement.repository.RegionRepository;
import com.maintenance.equipement.service.RegionService;

@Service
public class RegionServiceImpl implements RegionService {

	@Autowired
	RegionRepository repository;
	
	@Override
	public Optional<Region> findOne(Long id) {
		return repository.findById(id);
	}

	@Override
	public List<Region> findAll() {
			return repository.findAll();
	}

	@Override
	public void save(Region region) {
	repository.save(region);
		
	}

	@Override
	public void update(Region region) {
	 repository.save(region);
		
	}

	@Override
	public void delete(Long id) {
	 repository.deleteById(id);
		
	}

	@Override
	public void delete(Region region) {
	repository.delete(region);
		
		
	}

}
