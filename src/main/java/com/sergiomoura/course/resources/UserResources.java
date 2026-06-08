package com.sergiomoura.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sergiomoura.course.entities.User;



	@RestController
	@RequestMapping(value = "/users")
	public class UserResources {
		
		@GetMapping
	  
		public ResponseEntity<User> findAll(){
			
			User u = new User(1L, "Sergio Moura", "sergio@email.com", "61 998443045", "********");
			return ResponseEntity.ok().body(u);
		}
		
		
	}
	

