package com.amal.livres.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amal.livres.entities.Livre;
import com.amal.livres.service.LivreService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class LivreRESTController {
	
	@Autowired
	LivreService livreService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Livre> getAllProduits() {
	return livreService.getAllLivres();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Livre getLivreById(@PathVariable("id") Long id) {
	return livreService.getLivre(id);
	 }
	
	@RequestMapping(method = RequestMethod.POST)
	public Livre createLivre(@RequestBody Livre livre) {
	return livreService.saveLivre(livre);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Livre updateLivre(@RequestBody Livre livre) {
	return livreService.updateLivre(livre);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteLivre(@PathVariable("id") Long id)
	{
	livreService.deleteLivreById(id);
	}
	
	@RequestMapping(value="/livregenre/{idGenre}",method = RequestMethod.GET)
	public List<Livre> getProduitsByCatId(@PathVariable("idGenre") Long idGenre) {
	return livreService.findByGenreIdGenre(idGenre);
	}
	
	
	@RequestMapping(value="/livreByName/{nom}",method = RequestMethod.GET)
	public List<Livre> findByNomLivreContains(@PathVariable("nom") String nom) {
	return livreService.findByNomLivreContains(nom);
	}


	

}
