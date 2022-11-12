package com.spring.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.Curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
