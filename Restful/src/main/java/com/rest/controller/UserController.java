package com.rest.controller;
import java.net.URI;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.rest.dao.UserDao;
import com.rest.dto.User;
import com.rest.exception.UserNotFoundException;

@RestController
public class UserController {
	
	@Autowired
	private UserDao userDao;
	
	//GET /users
	//retrieveAllUsers
	@GetMapping("/users")
	public List<User> retrieveAllUsers(){
		return userDao.findAll();
	}
	
	//GET /user/{id}
	//retrieve one user
	@GetMapping("/user/{id}")
	public User retrieveUser(@PathVariable int id){
		  User user = userDao.findOne(id);
		  if(user == null)
		  {
			  throw new UserNotFoundException("id - "+id);
		  }
		 return user;
	}
	//create new user
	@PostMapping("/user")
	public ResponseEntity<Object> createUser(@Valid @RequestBody User user) {
		User savedUser = userDao.save(user);
		//to get new URI 
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
		
		//to add created status 201
		return ResponseEntity.created(location).build();
		
	}
	
	//delete user
	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable int id){
		  User user = userDao.deleteById(id);
		  if(user == null)
		  {
			  throw new UserNotFoundException("id - "+id);
		  }
	}
	

}
