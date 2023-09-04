package com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.usecase.book;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class CreateBookCommand {
    private String title;
    private String isbn;
    private LocalDate publishedDate;

    public static CreateBookCommand of(
            String title,
            String isbn,
            LocalDate publishedDate
    ) {
        CreateBookCommand command = new CreateBookCommand();
        command.title = title;
        command.isbn = isbn;
        command.publishedDate = publishedDate;
        return command;
    }
}
