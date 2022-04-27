package com.example.control.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.control.entities.Livre;

public interface LivreRepo extends JpaRepository<Livre, Integer>{
	
}
