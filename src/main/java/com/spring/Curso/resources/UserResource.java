package com.spring.Curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Curso.entidades.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	//ENDPOINT PRA ACESSAR OS USUÁRIOS
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User user = new User(1L,"Maria","maria@gmail.com","7364734", "12345");
		return ResponseEntity.ok().body(user);
	}
	
}
