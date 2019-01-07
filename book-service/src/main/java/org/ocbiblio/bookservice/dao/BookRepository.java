package org.ocbiblio.bookservice.dao;

import org.ocbiblio.bookservice.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BookRepository extends JpaRepository <Book, Long> {
}
