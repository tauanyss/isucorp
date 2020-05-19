package com.company.isucorp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.isucorp.model.Contact;
import com.company.isucorp.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer>{

	List<Reservation> findAllByContact(Contact contact);
}
