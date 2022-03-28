package com.maintenance.equipement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Equipement {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String equipe;
    private String type;
    private String marque;
    private String model;
    private String serie;
    private String capacite;
    private String fourn;
   
      @ManyToOne 
    private District district;
}
