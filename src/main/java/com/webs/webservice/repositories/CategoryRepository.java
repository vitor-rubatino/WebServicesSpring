package com.webs.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webs.webservice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
