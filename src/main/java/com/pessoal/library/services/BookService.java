package com.pessoal.library.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pessoal.library.entities.Book;
import com.pessoal.library.repositories.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> findAll(){
		return bookRepository.findAll();
	}
	
	public Book findById(Long id) {
		Optional<Book> book = bookRepository.findById(id);
		return book.orElseThrow(() -> new RuntimeException("Object not found"));
	}

	public Book insert(Book obj) {
		return bookRepository.save(obj);
	}
	
	public void delete(Long id) {
		findById(id);
		bookRepository.deleteById(id);
	}
	
	public Book update(Long id, Book bookData) {
		Book book = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Object not found"));
		
		book.setTitle(bookData.getTitle());
		book.setAuthor(bookData.getAuthor());
		book.setGenre(bookData.getGenre());
		book.setAvailable(bookData.getAvailable());
	
		return bookRepository.save(book);
	}
	
}	
