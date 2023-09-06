package com.github.seungyeoplee.blogexample.springtest.withtestcontainerandflyway.domain.book.entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long id;

    private String title;

    private String isbn;

    private LocalDate publishedDate;

    @CreatedDate
    private LocalDateTime createdAt;

    public static Book of(
            String title,
            String isbn,
            LocalDate publishedDate
    ) {
        Book book = new Book();
        book.title = title;
        book.isbn = isbn;
        book.publishedDate = publishedDate;
        return book;
    }
}
