package com.company.isucorp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Contact {
	
	@Id
	@GeneratedValue
	private Integer	id;
	private String name;
	private String contactType;
	private Date birthDate;
	private String phoneNumber;

}
