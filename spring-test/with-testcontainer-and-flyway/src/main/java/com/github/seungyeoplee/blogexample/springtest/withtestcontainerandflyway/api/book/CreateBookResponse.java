package com.github.seungyeoplee.blogexample.springtest.withtestcontainerandflyway.api.book;

import com.github.seungyeoplee.blogexample.springtest.withtestcontainerandflyway.domain.book.entity.Book;
import lombok.Getter;

@Getter
public class CreateBookResponse {
    private Long bookId;

    public static CreateBookResponse from(Book book) {
        CreateBookResponse response = new CreateBookResponse();
        response.bookId = book.getId();
        return response;
    }
}
