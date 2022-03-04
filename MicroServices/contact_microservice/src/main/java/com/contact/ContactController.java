package com.contact;

import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

	@Autowired
	private ContactRepo repo;

	@GetMapping("/allContacts")
	public ArrayList<Contact> findAll() {

		return repo.findAll();

	}

	@GetMapping("/contact/{id}")
	public Contact getContact(@PathVariable("id") int contactId) {

		Optional<Contact> contact = repo.getContact(contactId);
		return contact.orElse(new Contact(000, 000, "No data"));

	}

}
