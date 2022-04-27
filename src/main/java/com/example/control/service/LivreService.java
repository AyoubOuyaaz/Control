package com.example.control.service;

import java.util.List;

import javax.persistence.OrderBy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.control.entities.Livre;
import com.example.control.repos.LivreRepo;


@Service
public class LivreService {

	@Autowired
	private LivreRepo repository;
	
	//Ajouter 
	public Livre saveBook(Livre livre) {
		return repository.save(livre);
	}
	
	//Afficher tous
	@OrderBy
	public List<Livre> getBooks(){
		return repository.findAll();
	}
	
	//Affichage by id
	public Livre getBookById(int id){
		return repository.findById(id).orElse(null);
	}
	
	//supprimer by id
	public String deleteBookById(int id) {
		repository.deleteById(id);
		return "Livre " +id+ " Supprimé";
	}
	
	//supprimer tous
	public String deleteBooks() {
		repository.deleteAll();
		return "Tous les Livres a été Supprimé";
	}
	
	//Modification
	public Livre updateBook(Livre livre) {
		Livre existingBook=repository.findById(livre.getIdLivre()).orElse(null);
		existingBook.setTitre(livre.getTitre());
		existingBook.setMaisonEdition(livre.getMaisonEdition());
		existingBook.setDateSortie(livre.getDateSortie());
		existingBook.setAuteur(livre.getAuteur());
		existingBook.setNbrPage(livre.getNbrPage());
		existingBook.setIsbn(livre.getIsbn());
		existingBook.setDateDernierConsultation(livre.getDateDernierConsultation());
		existingBook.setDisponible(livre.isDisponible());
		
		return repository.save(existingBook);
	}
	
}
