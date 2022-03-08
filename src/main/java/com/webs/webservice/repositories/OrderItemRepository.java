package com.webs.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webs.webservice.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
