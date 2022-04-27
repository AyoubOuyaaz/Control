package com.example.control.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @AllArgsConstructor @NoArgsConstructor 
@Entity @Table(name = "Livre_Table")
public class Livre {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_livre")
	private int idLivre;
	
	@Column(name = "TITRE", length = 50, nullable = false)
	private String titre;
	
	@Column(name = "MAISON_EDITION", updatable = false, nullable = false)
	private String maisonEdition;
	
	@Column(name = "DATE_SORTIE")
	private Date dateSortie; 
	
	@Column(name = "AUTEUR")
	private String auteur;
	
	@Column(name = "NBR_PAGE")
	private int nbrPage;
	
	@Column(name = "ISBN", updatable = false, unique = true)
	private int isbn;
	
	@Column(name = "DATE_DERNIER_CONSULTATION")
	private Date dateDernierConsultation;
	
	
	private boolean disponible;
	
	public Livre() {
		
	}

	public Livre(int idLivre, String titre, String maisonEdition, Date dateSortie, String auteur, int nbrPage, int isbn,
			Date dateDernierConsultation, boolean disponible) {
		super();
		this.idLivre = idLivre;
		this.titre = titre;
		this.maisonEdition = maisonEdition;
		this.dateSortie = dateSortie;
		this.auteur = auteur;
		this.nbrPage = nbrPage;
		this.isbn = isbn;
		this.dateDernierConsultation = dateDernierConsultation;
		this.disponible = disponible;
	}

	public int getIdLivre() {
		return idLivre;
	}

	public void setIdLivre(int idLivre) {
		this.idLivre = idLivre;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getMaisonEdition() {
		return maisonEdition;
	}

	public void setMaisonEdition(String maisonEdition) {
		this.maisonEdition = maisonEdition;
	}

	public Date getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getNbrPage() {
		return nbrPage;
	}

	public void setNbrPage(int nbrPage) {
		this.nbrPage = nbrPage;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public Date getDateDernierConsultation() {
		return dateDernierConsultation;
	}

	public void setDateDernierConsultation(Date dateDernierConsultation) {
		this.dateDernierConsultation = dateDernierConsultation;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return "Livre [idLivre=" + idLivre + ", titre=" + titre + ", maisonEdition=" + maisonEdition + ", dateSortie="
				+ dateSortie + ", auteur=" + auteur + ", nbrPage=" + nbrPage + ", isbn=" + isbn
				+ ", dateDernierConsultation=" + dateDernierConsultation + ", disponible=" + disponible + "]";
	}
	
	
	
}
