package com.pessoal.library.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pessoal.library.entities.Library;
import com.pessoal.library.services.LibraryService;

@RestController
@RequestMapping(value = "/libraries")
public class LibraryResource {
	
	@Autowired
	private LibraryService libraryService;

	@GetMapping
	public ResponseEntity<List<Library>> findAll() {
		List<Library> list = libraryService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Library> findById(@PathVariable Long id) {
		Library libraryRequested = libraryService.findById(id);
		return ResponseEntity.ok().body(libraryRequested);
	}
	
	@PostMapping
	public ResponseEntity<Library> insert(@RequestBody Library obj) {
		Library savedLib = libraryService.insert(obj);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedLib);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		libraryService.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Library> update(@RequestBody Library libraryData, @PathVariable Long id){
		Library updatedLibrary = libraryService.update(id, libraryData);
		return ResponseEntity.ok(updatedLibrary);
	}
	
}
