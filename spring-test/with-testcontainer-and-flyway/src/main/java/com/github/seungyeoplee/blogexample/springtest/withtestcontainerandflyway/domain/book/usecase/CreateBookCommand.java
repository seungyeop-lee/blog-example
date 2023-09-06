package com.github.seungyeoplee.blogexample.springtest.withtestcontainerandflyway.domain.book.usecase;

import com.github.seungyeoplee.blogexample.springtest.withtestcontainerandflyway.domain.book.entity.Book;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class CreateBookCommand {
    private String title;
    private String isbn;
    private LocalDate publishedDate;

    public static CreateBookCommand of(String title, String isbn, LocalDate publishedDate) {
        CreateBookCommand command = new CreateBookCommand();
        command.title = title;
        command.isbn = isbn;
        command.publishedDate = publishedDate;
        return command;
    }

    public Book toEntity() {
        return Book.of(title, isbn, publishedDate);
    }
}
