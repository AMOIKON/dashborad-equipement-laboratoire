package com.maintenance.equipement.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Entity
public class Acte {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
@DateTimeFormat(pattern = "dd-MM-yyyy")
private Date debut;
@DateTimeFormat(pattern = "dd-MM-yyyy")
private Date fin;

@ManyToOne
private Region region;
@ManyToOne
private District district;
@ManyToOne
private Lieu lieu;
@ManyToOne
private Pmo pmo;


}
