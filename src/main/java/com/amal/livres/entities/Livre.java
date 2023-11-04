package com.amal.livres.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor 
@Entity 
public class Livre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLivre;
	
    private String nomLivre;
	private Double prixLivre;
	private Date dateCreation;
	
	@ManyToOne
	private Genre genre;
	
	/*
	
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public Long getIdLivre() {
		return idLivre;
	}
	public void setIdLivre(Long idLivre) {
		this.idLivre = idLivre;
	}
	public String getNomLivre() {
		return nomLivre;
	}
	public void setNomLivre(String nomLivre) {
		this.nomLivre = nomLivre;
	}
	public Double getPrixLivre() {
		return prixLivre;
	}
	public void setPrixLivre(Double prixLivre) {
		this.prixLivre = prixLivre;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	@Override
	public String toString() {
		return "Livre [idLivre=" + idLivre + ", nomLivre=" + nomLivre + ", prixLivre=" + prixLivre + ", dateCreation="
				+ dateCreation + "]";
	}
	
	public Livre(Long idLivre, String nomLivre, Double prixLivre, Date dateCreation) {
		super();
		this.idLivre = idLivre;
		this.nomLivre = nomLivre;
		this.prixLivre = prixLivre;
		this.dateCreation = dateCreation;
	}
	public Livre() {
		super();
		// TODO Auto-generated constructor stub
	} */
	
	public Livre(String nomLivre, Double prixLivre, Date dateCreation) {
		super();
		this.nomLivre = nomLivre;
		this.prixLivre = prixLivre;
		this.dateCreation = dateCreation;
		}

}
