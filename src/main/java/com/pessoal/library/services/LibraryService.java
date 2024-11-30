package com.pessoal.library.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pessoal.library.repositories.LibraryRepository;

@Service
public class LibraryService {
	
	@Autowired
	private LibraryRepository libraryRepository;
}
