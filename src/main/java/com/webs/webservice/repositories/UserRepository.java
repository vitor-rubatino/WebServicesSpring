package com.webs.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webs.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
}
