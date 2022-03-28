package com.maintenance.equipement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity

public class Laboratoire {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String resp;
	private String contact;
	private String email;
	private String Lab_type;
	private String infra;
	private String criem;
	private String criemtel;
	private String criemail;
	private String tlab;

	
	
	@ManyToOne
    private Lieu lieu;
	@ManyToOne
    private District District;
	
	
}
