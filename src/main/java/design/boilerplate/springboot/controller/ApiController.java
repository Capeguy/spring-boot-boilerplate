package design.boilerplate.springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;
import design.boilerplate.springboot.model.User;
import design.boilerplate.springboot.repository.UserRepository;
import io.swagger.v3.oas.annotations.parameters.RequestBody;


@RestController
public class ApiController {
	UserRepository userRepo;
	@GetMapping("/api/sayHello")
	public ResponseEntity<String> sayHello() {
		return ResponseEntity.ok("Hello Spring Boot Boilerplate");
	}
	


}
