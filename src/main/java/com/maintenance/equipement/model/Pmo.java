package com.maintenance.equipement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Pmo {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String pm;
	private String pnom;
	private String pcontact;
	private String pemail;
	@ManyToOne
	private Region region;
	@ManyToOne
	private District district;
}
