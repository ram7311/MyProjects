package com.contact;

import java.util.ArrayList;
import java.util.Optional;
import org.springframework.stereotype.Component;

@Component
public class ContactRepo {

	public ArrayList<Contact> findAll() {
		ArrayList<Contact> list = new ArrayList<Contact>();
		list.add(new Contact(1001,33221,"ramkumar7311@gmail.com"));
		list.add(new Contact(1002,99887,"Samsundhar15@yahoo.com"));
		list.add(new Contact(1003,67676,"Ahalya1998@hotmail.com"));
		list.add(new Contact(1004,88888,"Neeraja@cgi.com"));
		return list;
	}
	
	public Optional<Contact> getContact(int userId) {
		return findAll().stream().filter(s->s.getUserId()==userId).findAny();
	}
}
