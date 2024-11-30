package com.pessoal.library.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pessoal.library.services.LibraryService;

@RestController
@RequestMapping(value = "/libraries")
public class LibraryResource {
	
	@Autowired
	private LibraryService libraryService;

}
