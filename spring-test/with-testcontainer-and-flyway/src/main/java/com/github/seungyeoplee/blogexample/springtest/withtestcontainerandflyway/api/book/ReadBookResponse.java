package com.github.seungyeoplee.blogexample.springtest.withtestcontainerandflyway.api.book;

import com.github.seungyeoplee.blogexample.springtest.withtestcontainerandflyway.domain.book.entity.Book;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class ReadBookResponse {
    private Long bookId;
    private String title;
    private String isbn;
    private LocalDate publishedDate;

    public static ReadBookResponse from(Book book) {
        ReadBookResponse response = new ReadBookResponse();
        response.bookId = book.getId();
        response.title = book.getTitle();
        response.isbn = book.getIsbn();
        response.publishedDate = book.getPublishedDate();
        return response;
    }
}
