package com.maintenance.equipement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maintenance.equipement.model.Lieu;
import com.maintenance.equipement.repository.LieuRepository;
import com.maintenance.equipement.service.LieuService;
@Service
public class LieuServiceImpl  implements LieuService{
	
	@Autowired
	LieuRepository repository;
	
	@Override
	public Optional<Lieu> findOne(Long id) {
		return repository.findById(id);
	}

	@Override
	public List<Lieu> findAll() {
			return repository.findAll();
	}

	@Override
	public void save(Lieu lieu) {
	repository.save(lieu);
		
	}

	@Override
	public void update(Lieu lieu) {
	 repository.save(lieu);
		
	}

	@Override
	public void delete(Long id) {
	 repository.deleteById(id);
		
	}

	@Override
	public void delete(Lieu lieu) {
	repository.delete(lieu);
		
		
	}

	
}
