package com.company.isucorp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.isucorp.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer>{
	
	Contact findByName(String name);

}
