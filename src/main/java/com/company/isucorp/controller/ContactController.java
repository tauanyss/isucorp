package com.company.isucorp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.company.isucorp.model.Contact;
import com.company.isucorp.service.ContactService;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/contact")
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
    @GetMapping("/getContact")
    public Contact getContact(@RequestParam String contactName) {
    	return contactService.findContact(contactName);
    }
    
    @DeleteMapping("/delete")
    public void deleteContact(@RequestParam Integer id) {
    	contactService.delete(id);
    }

}
