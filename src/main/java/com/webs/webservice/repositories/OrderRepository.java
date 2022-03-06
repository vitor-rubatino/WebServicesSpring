package com.webs.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webs.webservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	
}
