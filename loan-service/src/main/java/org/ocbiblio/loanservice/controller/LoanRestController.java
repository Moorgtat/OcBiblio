package org.ocbiblio.loanservice.controller;

import org.ocbiblio.loanservice.dao.LoanRepository;
import org.ocbiblio.loanservice.entities.Loan;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
public class LoanRestController {

    private LoanRepository loanRepository;

    LoanRestController(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    @RequestMapping("/ListLoans/")
    public List<Loan> ListLoans(@RequestParam(name = "pseudo", defaultValue = "") String pseudo) {
        return loanRepository.findAllByPseudoEmprunteur(pseudo);
    }

    @PostMapping("/createLoan/")
    public Loan loan(@RequestParam(name = "pseudoEmprunteur", defaultValue = "") String pseudoEmprunteur,
                     @RequestParam(name = "nomLivre", defaultValue = "") String nomLivre) {
        Date debutPret = new Date();
        long addTime = debutPret.getTime() + 5 * 24 * 60 * 60 * 1000;
        Date finPret = new Date(addTime);
        Loan loan = new Loan(debutPret, finPret, nomLivre, pseudoEmprunteur);
        return loanRepository.save(loan);
    }

    @PostMapping("/PatchLoan/")
    public Loan loan(@RequestParam(name = "id", defaultValue = "") long id) {
        Loan loan = loanRepository.getOne(id);
        long addTime = loan.getFinPret().getTime() + 5 * 24 * 60 * 60 * 1000;
        Date ProlPret = new Date(addTime);
        loan.setFinPret(ProlPret);
        return loanRepository.save(loan);
    }

    @RequestMapping("/DeleteLoan/")
    public void DeleteLoan(@RequestParam(name = "id", defaultValue = "") long id) {
        Loan loan = loanRepository.getOne(id);
        loanRepository.delete(loan);
    }
  // Méthode pour prolonger le prêt @PatchMapping("/patchLoan")
}
