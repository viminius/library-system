package com.pessoal.library.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pessoal.library.services.LoanService;

@RestController
@RequestMapping(value = "/loans")
public class LoanResource {
	
	@Autowired
	private LoanService loanService;

}
