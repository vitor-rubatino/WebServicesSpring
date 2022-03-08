package com.webs.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webs.webservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
