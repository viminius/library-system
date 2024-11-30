package com.pessoal.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pessoal.library.entities.Loan;

public interface LoanRepository extends JpaRepository<Loan, Long>{

}
