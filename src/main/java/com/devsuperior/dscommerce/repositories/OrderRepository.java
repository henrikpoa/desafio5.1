package com.devsuperior.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dscommerce.entities.Order;

//@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
