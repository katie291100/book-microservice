package uk.ac.york.eng2.books.controllers;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;
import uk.ac.york.eng2.books.domain.Book;
import uk.ac.york.eng2.books.repositories.BooksRepository;

@Controller("/books")
public class BooksController {
	@Inject 
	private BooksRepository repo;
	
	@Get("/")
	public Iterable<Book> list(){
		return repo.findAll();

		
	}
}
