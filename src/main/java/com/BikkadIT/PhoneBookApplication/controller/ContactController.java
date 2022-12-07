package com.BikkadIT.PhoneBookApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.PhoneBookApplication.entity.Contact;
import com.BikkadIT.PhoneBookApplication.service.ContactServiceI;

@RestController
public class ContactController {

	@Autowired
	private ContactServiceI contactServiceI;

	@PostMapping(value = "/saveContact", consumes = "application/json")
	public ResponseEntity<String> saveContact(@RequestBody Contact contact) {

		boolean saveContact = contactServiceI.saveContact(contact);

		if (saveContact) {
			String msg = "Contact Saved Successfully";
			return new ResponseEntity<String>(msg, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<String>("Contact Not Saved Successfully", HttpStatus.CREATED);
		}
	}

	@GetMapping(value = "/getAllContact", produces = "application/json")
	public ResponseEntity<List<Contact>> getAllContact() {

		List<Contact> allContact = contactServiceI.getAllContact();

		return new ResponseEntity<List<Contact>>(allContact, HttpStatus.OK);
	}
	
	@GetMapping(value="/getContactById/{contactId}" , produces = "application/json")
	public ResponseEntity<Contact> getContactById(@PathVariable Integer contactId){
		
		Contact contact = contactServiceI.getContactById(contactId);
		
		return new ResponseEntity<Contact>(contact,HttpStatus.OK);
		
	}
	
	@PutMapping(value="/updateContact/{id}" ,consumes = "application/json")
	public ResponseEntity<String> updateContact(@RequestBody Contact contact, @PathVariable Integer id){
		boolean updateContact = contactServiceI.updateContact(contact ,id);
		
		if (updateContact) {
			String msg = "Contact Updated  Successfully";
			return new ResponseEntity<String>(msg, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<String>("Contact not Updated Successfully", HttpStatus.CREATED);

		}

	}
	
	@DeleteMapping("/deleteContact{id}")
	public ResponseEntity<String> deleteContact(@PathVariable Integer id){
		
		boolean deleteContact = contactServiceI.deleteContact(id);
		
		if(deleteContact) {
			
			String msg="Contact deleted successfully";
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		}else {
			
			return new ResponseEntity<String>("Contact not deleted successfully", HttpStatus.OK);
		}
		
	}
}
