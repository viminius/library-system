package com.pessoal.library.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pessoal.library.entities.Book;
import com.pessoal.library.services.BookService;

@RestController
@RequestMapping(value = "/books")
public class BookResource {
	
	@Autowired
	private BookService bookService;

	@GetMapping
	public ResponseEntity<List<Book>> findAll(){
		List<Book> list = bookService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Book> findById(@PathVariable Long id) {
		Book bookRequested = bookService.findById(id);
		return ResponseEntity.ok().body(bookRequested);
	}
	
	@PostMapping
	public ResponseEntity<Book> insert(@RequestBody Book obj) {
		Book savedBook = bookService.insert(obj);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedBook);
	}	
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		bookService.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	
}
