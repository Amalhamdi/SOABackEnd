package com.amal.livres.dto;

import java.util.Date;

import com.amal.livres.entities.Genre;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor 
public class LivreDTO {
	
    private Long idLivre;
    private String nomLivre;
	private Double prixLivre;
	private Date dateCreation;
	private Genre genre;

}
