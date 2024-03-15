package com.devsuperior.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dscommerce.entities.Category;

//@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
