package com.maintenance.equipement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maintenance.equipement.model.Contract;
import com.maintenance.equipement.repository.ContractRepository;
import com.maintenance.equipement.service.ContractService;

@Service
public class ContractServiceImpl implements ContractService {

	@Autowired
	ContractRepository repository;
	
	@Override
	public Optional<Contract>findOne(Long id){
		return repository.findById(id);
	}
	
	@Override
	public List<Contract>findAll(){
		return repository.findAll();
	}
	
	@Override
	public void save(Contract contract) {
		repository.save(contract);
		
	}
	
	@Override
	
	public void update(Contract contract) {
		repository.save(contract);
	}
	
	@Override
	public void delete(Contract contract) {
		repository.delete(contract);
	}
	
	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
}
