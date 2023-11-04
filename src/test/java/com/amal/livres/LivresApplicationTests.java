package com.amal.livres;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.amal.livres.entities.Genre;
import com.amal.livres.entities.Livre;
import com.amal.livres.repos.LivreRepository;

@SpringBootTest
class LivresApplicationTests {
	
	@Autowired
	private LivreRepository livreRepository;
	
	@Test
	public void testCreateLivre() {
	Livre l = new Livre("twilight",2200.500,new Date());
	livreRepository.save(l);
	}
	
	@Test
	public void testFindLivre()
	{
	Livre l = livreRepository.findById(1L).get(); 
	System.out.println(l);
	}
	
	@Test
	public void testUpdateLivre()
	{
	Livre l = livreRepository.findById(1L).get(); 
	l.setPrixLivre(1000.0);
	livreRepository.save(l);
	}
	
	@Test
	public void testDeleteProduit()
	{
	livreRepository.deleteById(1L);;
	}
	
	@Test
	public void testListerTousLivres()
	{
	List<Livre> ls = livreRepository.findAll();
	for (Livre l : ls)
	{
	System.out.println(l);
	}
	}
	
	
	 @Test
	 public void testFindByNomLivre()
	 {
	 List<Livre> prods = livreRepository.findByNomLivre("harry potter");
	 for (Livre p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 
	 @Test
	 public void testFindByNomlivreContains ()
	 {
	 List<Livre> prods = livreRepository.findByNomLivreContains("i");
	 for (Livre p : prods)
	 {
	 System.out.println(p);
	 } }
	 
	 @Test
	 public void testfindByNomPrix()
	 {
	 List<Livre> prods = livreRepository.findByNomPrix("harry potter", 1000.0);
	 for (Livre p : prods)
	 {
	 System.out.println(p);
	 }
	 }

	
	 @Test
	 public void testfindByGenre()
	 {
	 Genre g = new Genre();
	 g.setIdGenre(1L);
	 List<Livre> prods = livreRepository.findByGenre(g);
	 for (Livre p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 
	 @Test
	 public void findByGenreIdGenre()
	 {
	 List<Livre> prods = livreRepository.findByGenreIdGenre(1L);
	 for (Livre p : prods)
	 {
	 System.out.println(p);
	 }
	  }
	 
	 @Test
	 public void testfindByOrderByNomLivreAsc()
	 {
	 List<Livre> prods = livreRepository.findByOrderByNomLivreAsc();
	 for (Livre p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 
	 @Test
	 public void testTrierProduitsNomsPrix()
	 {
	 List<Livre> prods = livreRepository.trierLivresNomsPrix();
	 for (Livre p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 


	@Test
	void contextLoads() {
	}

}
