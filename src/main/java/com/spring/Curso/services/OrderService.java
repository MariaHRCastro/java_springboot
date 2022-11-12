package com.spring.Curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Curso.entities.Order;
import com.spring.Curso.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	
	// O FIND ALL ESTÁ OCORRENDO NA CAMADA DE SERVIÇO. ELA REPASSA A CHAMADA PARA O REPOSITORY.
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
