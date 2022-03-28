package com.maintenance.equipement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maintenance.equipement.model.Contract;

public interface ContractRepository extends JpaRepository<Contract, Long> {

}
