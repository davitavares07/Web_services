package com.projectweb.demo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectweb.demo.entities.User;

@RestController
@RequestMapping (value = "/users")
public class UserResources {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Davi", "Davi@gmail.com", "85995859545", "12345");
		return ResponseEntity.ok().body(u);
	}
}
