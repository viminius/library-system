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

import com.pessoal.library.entities.Loan;
import com.pessoal.library.services.LoanService;

@RestController
@RequestMapping(value = "/loans")
public class LoanResource {
	
	@Autowired
	private LoanService loanService;

	@GetMapping
	public ResponseEntity<List<Loan>> findAll() {
		List<Loan> list = loanService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Loan> findById(@PathVariable Long id) {
		Loan loanRequested = loanService.findById(id);
		return ResponseEntity.ok().body(loanRequested);
	}
	
	@PostMapping
	public ResponseEntity<Loan> insert(@RequestBody Loan obj) {
		Loan savedLoan = loanService.insert(obj);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedLoan);
	}
	
	@DeleteMapping
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		loanService.delete(id);
		return ResponseEntity.noContent().build();
	}
}
