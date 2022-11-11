package com.spring.Curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.spring.Curso.entities.User;
import com.spring.Curso.repositories.UserRepository;

//COLOCAR ANOTAÇÃO PRA DEIXAR CLARO QUE É UMA CLASSE DE CONFIGURAÇÃO
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	//INJEÇÃO DE DEPENDÊNCIA, O REPOSITORY LIDA COM OS DADOS, VIDE AS FUNÇÕES DO OBJETO DELE
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

	//TUDO QUE ESTIVER DENTRO DO RUN VAI SER EXECUTADO
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		//SALVAR COMO LISTA, ACHO QUE DÁ PRA IR ADD COM UM FOR TAMBÉM
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}
	
	
	
}
