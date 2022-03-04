package com.user;

import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class UserController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private UserRepo repo;
	
	@Value("service.url")
	private String url;
	
	ObjectMapper om = new ObjectMapper();
	HttpHeaders header = new HttpHeaders();
	
	
	@GetMapping("/allUsers")
	public ArrayList<User> findAll() {
		System.out.println("URL fetched from config server of git-=->"+url);
		return repo.findAll();
	}

	@GetMapping("/user/{id}")
	public User getuser(@PathVariable("id") int userId) {

		Optional<User> user = repo.getUser(userId);
		
		header.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> httpEntity = new HttpEntity<String>(header);
		ResponseEntity<Object> exchange = restTemplate.exchange("http://contact-service/contact/"+userId, HttpMethod.GET, httpEntity, Object.class);
		Contact contact = om.convertValue(exchange.getBody(), Contact.class);
		
	    if(user.isPresent()) {
	    	user.get().setContact(contact);
	    }
		return user.orElse(new User(000, "No User", null));

	}

}
