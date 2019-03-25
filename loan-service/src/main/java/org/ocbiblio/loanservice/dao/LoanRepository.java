package org.ocbiblio.loanservice.dao;

import org.hibernate.query.criteria.internal.expression.function.AggregationFunction;
import org.ocbiblio.loanservice.entities.Loan;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RepositoryRestResource
public interface LoanRepository extends JpaRepository <Loan, Long> {

    List <Loan> findAllByPseudoEmprunteur(String pseudo);
}
