package com.rest.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.rest.dto.User;

@Component
public class UserDao {

	private static List<User> users = new ArrayList<User>();
	private static int usersCount = 3;

	static {
		System.out.println("static block");
		users.add(new User(1, "ram", new Date()));
		users.add(new User(2, "sam", new Date()));
		users.add(new User(3, "harish", new Date()));
	}

	public List<User> findAll() {
		return users;
	}

	public User save(User user) {
		if (user.getId() == null) {
			user.setId(++usersCount);
		}
		users.add(user);
		return user;

	}

	public User findOne(int id) {
		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}
	
	public User deleteById(int id) {
		Iterator<User> iterator = users.iterator();
		while (iterator.hasNext()) {
			User user = iterator.next();
			if (user.getId() == id) {
				iterator.remove();
				return user;
			}

		}

		return null;
	}

}
