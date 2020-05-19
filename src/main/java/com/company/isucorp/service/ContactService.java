package com.company.isucorp.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.isucorp.model.Contact;
import com.company.isucorp.model.Reservation;
import com.company.isucorp.model.ReservationDto;
import com.company.isucorp.repository.ContactRepository;
import com.company.isucorp.repository.ReservationRepository;

@Service
public class ContactService {

	@Autowired
	private ContactRepository contactRepository;
	
	@Autowired
	private ReservationRepository reservationRepository;
	
	public Contact createContact(ReservationDto reservationDto) {
		Contact contact = new Contact();
		contact.setId(reservationDto.getContactId());
    	contact.setName(reservationDto.getName());
    	contact.setContactType(reservationDto.getContactType());
    	Date date = Date.valueOf(reservationDto.getBirthDate());
    	contact.setBirthDate(date);
    	contact.setPhoneNumber(reservationDto.getPhoneNumber());
    	return contactRepository.save(contact);
	}
	
	public Contact findContact(String contactName) {
		return contactRepository.findByName(contactName);
	}
	
	public void delete(Integer id) {
		Contact contact = contactRepository.findById(id).get();
		List<Reservation> reservations = reservationRepository.findAllByContact(contact);
		reservationRepository.deleteAll(reservations);
		contactRepository.delete(contact);
	}
	
}
