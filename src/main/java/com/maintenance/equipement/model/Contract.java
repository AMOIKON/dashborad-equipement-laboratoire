package com.maintenance.equipement.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity

public class Contract {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

private Long id;
private String structure;
private String rep_name;
private String rep_contact;
private String rep_mail;
private Date debut;
private Date fin;


}
