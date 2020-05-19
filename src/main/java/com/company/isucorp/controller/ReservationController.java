package com.company.isucorp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.company.isucorp.model.Contact;
import com.company.isucorp.model.Reservation;
import com.company.isucorp.model.ReservationDto;
import com.company.isucorp.service.ContactService;
import com.company.isucorp.service.ReservationService;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/reservation")
public class ReservationController {
	
	@Autowired
	private ReservationService reservationService;
	
	@Autowired
	private ContactService contactService;
	
	@GetMapping("/getReservationList")
	public List<Reservation> getAllReservations(){
		return reservationService.getReservationList();	
	}

	@GetMapping("/getReservation")
	public Reservation getReservation(@RequestParam Integer id) {
		return reservationService.findReservation(id);
	}
	
    @PostMapping("/createReservation")
    public Reservation createReservation(@RequestBody ReservationDto reservationDto) {
    	Contact contact = contactService.createContact(reservationDto);
        return reservationService.createReservation(reservationDto, contact);
    }
    
    @DeleteMapping("/delete")
    public void deleteReservation(@RequestParam Integer id) {
    	reservationService.delete(id);
    }

}
