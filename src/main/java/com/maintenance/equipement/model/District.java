package com.maintenance.equipement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class District {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	@ManyToOne
	private Region region;
	
	
}
