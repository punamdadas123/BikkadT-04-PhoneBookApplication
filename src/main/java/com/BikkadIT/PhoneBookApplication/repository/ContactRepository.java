package com.BikkadIT.PhoneBookApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.PhoneBookApplication.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
