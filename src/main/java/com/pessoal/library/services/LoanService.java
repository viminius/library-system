package com.pessoal.library.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pessoal.library.entities.Loan;
import com.pessoal.library.repositories.LoanRepository;

@Service
public class LoanService {
	
	@Autowired
	private LoanRepository loanRepository;
	
	public List<Loan> findAll() {
		return loanRepository.findAll();
	}
	
	public Loan findById(Long id) {
		Optional<Loan> loan = loanRepository.findById(id);
		return loan.orElseThrow(() -> new RuntimeException("Object not found"));
	}
	
	public Loan insert(Loan obj) {
		return loanRepository.save(obj);
	}
	
	public void delete(Long id) {
		findById(id);
		loanRepository.deleteById(id);
	}
	
	
	
}
