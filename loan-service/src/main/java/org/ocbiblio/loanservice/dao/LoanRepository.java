package org.ocbiblio.loanservice.dao;

import org.ocbiblio.loanservice.entities.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface LoanRepository extends JpaRepository <Loan, Long> {
}
