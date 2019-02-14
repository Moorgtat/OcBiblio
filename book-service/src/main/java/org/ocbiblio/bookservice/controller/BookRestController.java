package org.ocbiblio.bookservice.controller;

import org.ocbiblio.bookservice.dao.BookRepository;
import org.ocbiblio.bookservice.entities.Book;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class BookRestController {

    private BookRepository bookRepository;
    BookRestController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/allBooks")
    public List <Book> allBooks () {
    return bookRepository.findAll();
    }

    @RequestMapping("/searchBooks/")
    public List <Book> ListBooks (@RequestParam(name="titre", defaultValue = "")String titre,
                                     @RequestParam(name="auteur", defaultValue = "")String auteur){
        return bookRepository.findByTitreIsContainingAndAuteurIsContaining(titre, auteur);
    }

    @PostMapping("/createBook")
    Book book(@RequestParam(name="titre", defaultValue = "")String titre,
              @RequestParam(name="description", defaultValue = "") String description,
              @RequestParam(name="auteur", defaultValue = "")String auteur,
              @RequestParam(name="image", defaultValue = "") String image) {
        Book book = new Book (titre, description, auteur, image);
        return bookRepository.save(book);
    }
}
