package com.moiom.restfull.ui.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moiom.restfull.ui.model.request.UserDetailsRequestModel;
import com.moiom.restfull.ui.model.response.UserRest;

@RestController
@RequestMapping("users") // http://localhost:8080/users
public class UserController {
	
	@GetMapping
	public String getUser() {
		return "getUser was called.";
	}
	
	@PostMapping
	public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails) {
		return null;
	}
	
	@PutMapping
	public String updateUser() {
		return "updateUser was called.";
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "deleteUser was called.";
	}
}