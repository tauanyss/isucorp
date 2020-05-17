package com.company.isucorp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Reservation {
	
	@Id
	@GeneratedValue
	private Integer	id;
	@OneToOne
	private Contact contact;
	private String editorData;


}
