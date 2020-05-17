package com.company.isucorp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.isucorp.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer>{

}
