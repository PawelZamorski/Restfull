package com.moiom.restfull.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.moiom.restfull.UserRepository;
import com.moiom.restfull.io.entity.UserEntity;
import com.moiom.restfull.service.UserService;
import com.moiom.restfull.shared.Utils;
import com.moiom.restfull.shared.dto.UserDto;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	public UserDto createUser(UserDto user) {
		// check if User exist
		if(userRepository.findByEmail(user.getEmail()) != null) throw new RuntimeException("Record already exist");
		
		// create entity to be stored in DB
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(user, userEntity);
		userEntity.setEncryptedPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		userEntity.setUserId(Utils.generateUserId(20));
		
		UserEntity storedUserDetails = userRepository.save(userEntity);
		
		// create UserDto to be send back
		UserDto returnValue = new UserDto();
		BeanUtils.copyProperties(storedUserDetails, returnValue);
		
		return returnValue;
	}

}
