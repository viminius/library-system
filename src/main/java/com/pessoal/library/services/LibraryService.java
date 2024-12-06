package com.pessoal.library.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pessoal.library.entities.Library;
import com.pessoal.library.repositories.LibraryRepository;

@Service
public class LibraryService {
	
	@Autowired
	private LibraryRepository libraryRepository;
	
	public List<Library> findAll() {
		return libraryRepository.findAll();
	}
	
	public Library findById(Long id) {
		Optional<Library> library = libraryRepository.findById(id);
		return library.orElseThrow(() -> new RuntimeException("Object not found"));
	}
	
	public Library insert(Library obj) {
		return libraryRepository.save(obj);
	}
	
	public void delete(Long id) {
		findById(id);
		libraryRepository.deleteById(id);
	}
	
	public Library update(Long id, Library libraryData) {
		Library library = libraryRepository.findById(id).orElseThrow(() -> new RuntimeException("Object not found"));
		
		library.setName(libraryData.getName());
		library.setAddress(libraryData.getAddress());
		
        return libraryRepository.save(library);
	}
}
