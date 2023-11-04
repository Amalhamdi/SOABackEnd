package com.amal.livres.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Genre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idGenre;
	
	private String nomGenre;
	private String descriptionGenre;
	
	@JsonIgnore
	@OneToMany(mappedBy = "genre")
	private List<Livre> livres;

	@Override
	public String toString() {
		return "Genre [idGenre=" + idGenre + ", nomGenre=" + nomGenre + ", descriptionGenre=" + descriptionGenre + "]";
	}

	/*
	public Long getIdGenre() {
		return idGenre;
	}

	public void setIdGenre(Long idGenre) {
		this.idGenre = idGenre;
	}

	public String getNomGenre() {
		return nomGenre;
	}

	public void setNomGenre(String nomGenre) {
		this.nomGenre = nomGenre;
	}

	public String getDescriptionGenre() {
		return descriptionGenre;
	}

	public void setDescriptionGenre(String descriptionGenre) {
		this.descriptionGenre = descriptionGenre;
	}

	public List<Livre> getLivres() {
		return livres;
	}

	public void setLivres(List<Livre> livres) {
		this.livres = livres;
	}

	@Override
	public String toString() {
		return "Genre [idGenre=" + idGenre + ", nomGenre=" + nomGenre + ", descriptionGenre=" + descriptionGenre
				+ ", livres=" + livres + "]";
	}

	public Genre(Long idGenre, String nomGenre, String descriptionGenre, List<Livre> livres) {
		super();
		this.idGenre = idGenre;
		this.nomGenre = nomGenre;
		this.descriptionGenre = descriptionGenre;
		this.livres = livres;
	}

	public Genre() {
		super();
		// TODO Auto-generated constructor stub
	}
	*/
	


}
