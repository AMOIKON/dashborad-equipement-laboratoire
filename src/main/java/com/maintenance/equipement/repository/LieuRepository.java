package com.maintenance.equipement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maintenance.equipement.model.Lieu;

public interface LieuRepository extends JpaRepository<Lieu, Long> {

}
