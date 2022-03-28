package com.maintenance.equipement.service;

import java.util.List;
import java.util.Optional;

import com.maintenance.equipement.model.Contract;

public interface ContractService {
	Optional<Contract>findOne(Long id);
	List<Contract>findAll();
	void save(Contract contract);
	void update(Contract contract);
	void delete(Contract contract);
	void delete(Long id);

}
