package com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.api.book.exam001;

import com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.entity.Book;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class DataManager {

    private final EXAM001Controller.Request request;
    private Book book;

    public String getIsbn() {
        return request.getIsbn();
    }

    public Book bookForInsert() {
        Book book = new Book();
        book.setTitle(request.getTitle());
        book.setIsbn(request.getIsbn());
        book.setPublishedDate(request.getPublishedDate());
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public EXAM001Controller.Response buildResponse() {
        return EXAM001Controller.Response.of(
                book.getBookId(),
                book.getTitle(),
                book.getIsbn(),
                book.getPublishedDate()
        );
    }
}
