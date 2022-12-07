package com.BikkadIT.PhoneBookApplication.service;

import java.util.List;

import com.BikkadIT.PhoneBookApplication.entity.Contact;

public interface ContactServiceI {

	public abstract boolean  saveContact(Contact contact);
	
	public abstract List<Contact> getAllContact();
	
	public abstract Contact getContactById(Integer id);
	
	public abstract boolean updateContact(Contact contact ,Integer id);
	
	public abstract boolean deleteContact(Integer id);

}
