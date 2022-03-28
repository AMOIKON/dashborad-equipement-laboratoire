package com.maintenance.equipement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity

public class Fournisseur {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

private Long id;
private String fr;
private String name;
private String contact;
private String Email;

	

}
