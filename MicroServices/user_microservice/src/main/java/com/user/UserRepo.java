package com.user;

import java.util.ArrayList;
import java.util.Optional;
import org.springframework.stereotype.Component;

@Component
public class UserRepo {

	public ArrayList<User> findAll() {
		ArrayList<User> list = new ArrayList<User>();
		list.add(new User(1001,"Ram",null));
		list.add(new User(1002,"Sam",null));
		list.add(new User(1003,"Ahalya",null));
		list.add(new User(1004,"Neeraja",null));
		return list;
	}
	
	public Optional<User> getUser(int userId) {
		return findAll().stream().filter(s->s.getUserId()==userId).findAny();
	}
}
