package com.amal.livres.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amal.livres.entities.Genre;
import com.amal.livres.repos.GenreRepository;

@RestController
@RequestMapping("/api/genre")
@CrossOrigin("*")
public class genreRESTController {
	
	@Autowired
	GenreRepository genreRepositorry;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Genre> getAllGenres()
	{
	return genreRepositorry.findAll();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Genre getGenreById(@PathVariable("id") Long id) {
	return genreRepositorry.findById(id).get();
	}
	

}
