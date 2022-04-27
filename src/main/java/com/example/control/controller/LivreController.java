package com.example.control.controller;

import java.util.List;

import javax.persistence.OrderBy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.control.entities.Livre;
import com.example.control.service.LivreService;

@RestController
public class LivreController {

	@Autowired
	private LivreService service;
	
	@PostMapping("/emsi_api/ajouterLivre")
	public Livre AjouterLivre(Livre livre) {
		return service.saveBook(livre);
	}
	
	@GetMapping("/emsi_api/livres")
	public List<Livre> AfficherLivres(){
		return service.getBooks();
	}
	
	@GetMapping("/emsi_api/livres/{id}")
	public Livre AfficherLivre(@PathVariable int id) {
		return service.getBookById(id);
	}
	
	@DeleteMapping("/emsi_api/supprimer/{id}")
	public String SupprimerLivre(@PathVariable int id) {
		return service.deleteBookById(id);
	}
	
	@DeleteMapping("/emsi_api/supprimer")
	public String SupprimerLivres() {
		return service.deleteBooks();
	}
	
	@PutMapping("/emsi_api/modifier")
	public Livre updateBook(Livre livre) {
		return service.updateBook(livre);
	}
}
