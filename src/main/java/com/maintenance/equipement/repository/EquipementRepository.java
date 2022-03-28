package com.maintenance.equipement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maintenance.equipement.model.Equipement;

public interface EquipementRepository extends JpaRepository<Equipement, Long> {

}
