package com.pessoal.library.entities;

import java.time.LocalDate;
import java.util.Objects;

import com.pessoal.library.enums.LoanStatus;

import jakarta.persistence.Id;

public class Loan {

	@Id
	private Long id;
	private LocalDate loanDate;
	private LocalDate returnDate;
	private LoanStatus status;
	
	public Loan() {
	}
	
	public Loan(Long id, LocalDate loanDate, LocalDate returnDate, LoanStatus status) {
		super();
		this.id = id;
		this.loanDate = loanDate;
		this.returnDate = returnDate;
		this.status = status;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public LocalDate getLoanDate() {
		return loanDate;
	}
	
	public void setLoanDate(LocalDate loanDate) {
		this.loanDate = loanDate;
	}
	
	public LocalDate getReturnDate() {
		return returnDate;
	}
	
	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
	
	public LoanStatus getStatus() {
		return status;
	}
	
	public void setStatus(LoanStatus status) {
		this.status = status;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loan other = (Loan) obj;
		return Objects.equals(id, other.id);
	}
}
