package com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.api.book.exam002;

import com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.entity.Book;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class DataManager {
    private final EXAM002Controller.Request request;
    private Book book;

    public Long getBookId() {
        return request.getBookId();
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public EXAM002Controller.Response buildResponse() {
        return EXAM002Controller.Response.of(
                book.getBookId(),
                book.getTitle(),
                book.getIsbn(),
                book.getPublishedDate()
        );
    }
}
