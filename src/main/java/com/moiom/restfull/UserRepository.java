package com.moiom.restfull;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.moiom.restfull.io.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
