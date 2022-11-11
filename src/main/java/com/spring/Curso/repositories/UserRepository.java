package com.spring.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.Curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
