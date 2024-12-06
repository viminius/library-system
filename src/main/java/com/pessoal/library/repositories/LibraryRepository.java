package com.pessoal.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pessoal.library.entities.Library;

public interface LibraryRepository extends JpaRepository<Library, Long>{

}
