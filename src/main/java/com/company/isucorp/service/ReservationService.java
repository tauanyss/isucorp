package com.company.isucorp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.isucorp.model.Contact;
import com.company.isucorp.model.Reservation;
import com.company.isucorp.model.ReservationDto;
import com.company.isucorp.repository.ReservationRepository;

@Service
public class ReservationService {

	@Autowired
	private ReservationRepository reservationRepository;
	
	public List<Reservation> getReservationList() {
		List<Reservation> reservation = reservationRepository.findAll();
    	return reservation;
	}
	
	public Reservation createReservation(ReservationDto reservationDto, Contact contact) {
    	Reservation reservation = new Reservation();
    	reservation.setContact(contact);
    	reservation.setEditorData(reservationDto.getEditorData());
    	return reservationRepository.save(reservation);
	}
	
}
