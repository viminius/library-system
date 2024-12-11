package com.pessoal.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pessoal.library.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
