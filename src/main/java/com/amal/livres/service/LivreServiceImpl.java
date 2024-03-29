package com.amal.livres.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amal.livres.entities.Genre;
import com.amal.livres.entities.Livre;
import com.amal.livres.repos.ImageRepository;
import com.amal.livres.repos.LivreRepository;


@Service
public class LivreServiceImpl implements LivreService{
	
	@Autowired
	LivreRepository livreRepository;
	
	@Autowired
	ImageRepository imageRepository;


	@Override
	public Livre saveLivre(Livre l) {
		return livreRepository.save(l);
	}

	@Override
	public Livre updateLivre(Livre l) {
		//Long oldProdImageId = 
				//this.getLivre(l.getIdLivre()).getImage().getIdImage();
		//Long newProdImageId = l.getImage().getIdImage();
		Livre livreUpdated = livreRepository.save(l);
		//if(oldProdImageId != newProdImageId) 
			//imageRepository.deleteById(oldProdImageId);
		return livreUpdated;
	}
	

	@Override
	public void deleteLivre(Livre l) {
		// TODO Auto-generated method stub
		livreRepository.delete(l);	
	}

	@Override
	public void deleteLivreById(Long id) {
		// supprimer l'image avant de supprimer le produit 
		Livre l = getLivre(id);
		try {
			Files.delete(Paths.get(System.getProperty("user.home")+"/images/"+l.getImagePath()));
			} catch (IOException e) {
			e.printStackTrace();
			} 
		livreRepository.deleteById(id);
		
	}

	@Override
	public Livre getLivre(Long id) {
		// TODO Auto-generated method stub
		return livreRepository.findById(id).get();
	}

	@Override
	public List<Livre> getAllLivres() {
		// TODO Auto-generated method stub
		return livreRepository.findAll();
	}

	@Override
	public List<Livre> findByNomLivre(String nom) {
		return livreRepository.findByNomLivre(nom);

	}

	@Override
	public List<Livre> findByNomLivreContains(String nom) {
		return livreRepository.findByNomLivreContains(nom);

	}

	@Override
	public List<Livre> findByNomPrix(String nom, Double prix) {
		return livreRepository.findByNomPrix(nom, prix);
		
	}

	@Override
	public List<Livre> findByGenre(Genre genre) {
		return livreRepository.findByGenre(genre);
	}

	@Override
	public List<Livre> findByGenreIdGenre(Long id) {
		return livreRepository.findByGenreIdGenre(id);
	}

	@Override
	public List<Livre> findByOrderByNomLivreAsc() {
		return livreRepository.findByOrderByNomLivreAsc();
	}

	@Override
	public List<Livre> trierLivresNomsPrix() {
		return livreRepository.trierLivresNomsPrix();
	}

}
