package com.spring.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.Curso.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
