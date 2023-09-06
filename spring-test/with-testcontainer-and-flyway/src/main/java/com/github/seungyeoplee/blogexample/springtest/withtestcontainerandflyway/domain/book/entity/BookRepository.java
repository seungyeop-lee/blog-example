package com.github.seungyeoplee.blogexample.springtest.withtestcontainerandflyway.domain.book.entity;

import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface BookRepository extends Repository<Book, Long> {
    Book save(Book entity);

    Optional<Book> findById(Long id);
}
