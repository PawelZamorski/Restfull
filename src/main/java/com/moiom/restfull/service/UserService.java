package com.moiom.restfull.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.moiom.restfull.shared.dto.UserDto;

public interface UserService extends UserDetailsService {
	UserDto createUser(UserDto user);
}
