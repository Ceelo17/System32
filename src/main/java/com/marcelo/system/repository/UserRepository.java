package com.marcelo.system.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.marcelo.system.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}