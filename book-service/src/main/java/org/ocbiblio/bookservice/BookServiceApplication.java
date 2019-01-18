package org.ocbiblio.bookservice;

//import org.ocbiblio.bookservice.dao.BookRepository;
//import org.ocbiblio.bookservice.entities.Book;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookServiceApplication implements CommandLineRunner {

//    @Autowired
//     private BookRepository bookRepository;

    public static void main(String[] args) {
        SpringApplication.run(BookServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

//        Book b1 = bookRepository.save(new Book("Kafka sur le rivage",
//                "Kafka Tamura s'enfuit de sa maison à Tokyo pour mener une étrange mission.",
//                "Haruki Murakami"));
//        Book b2 = bookRepository.save(new Book("Le bûcher des vanités",
//                "La vie new-yorkaise dans sa plus glaçante réalité avec ses âmes perdus.",
//                "Tom Wolfe"));
//        Book b3 = bookRepository.save(new Book("Le Monde d'hier",
//                "Autobiographie de l'europe d'avant guerre avec ses artistes passionnés.",
//                "Stefan Zweig"));
//        Book b4 = bookRepository.save(new Book("L'épopée du buveur d'eau",
//                "Bogus, fumiste farfelu, a un problème, son canal urinaire est trop étroit.",
//                "John Irving"));
//        Book b5 = bookRepository.save(new Book("L'attrape Coeur",
//                "Un collégien part trois nuits à l'aventure et à la recherche de soi même.",
//                "J.D Salinger"));
//        Book b6 = bookRepository.save(new Book("Le grand voyage",
//                "Un long voyage dont on ne revient pas sans être profondément marqué et choqué.",
//                "George Semprun"));
//        Book b7 = bookRepository.save(new Book("Le Parfum",
//                "Grenouille tente de mettre au point à l'aide de son odorat le parfum parfait.",
//                "Patrick Süskind"));
//        Book b8 = bookRepository.save(new Book("Un bonheur insoutenable",
//                "Copeau poursuivra la liberté coute que coute dans ce monde rempli d'interdits.",
//                "Ira Levin"));
//        Book b9 = bookRepository.save(new Book("Le cycle de Tschaï",
//                "Adam Reith, voyageur spatial, tente de quitter Tschaï et de regagner la Terre.",
//                "Jack Vance"));
//        Book b10 = bookRepository.save(new Book("Le dahlia noir",
//                "Qui a tué le dahlia noir? L'enquète du siècle ne restera pas sans réponses.",
//                "James Ellroy"));

    }
}

