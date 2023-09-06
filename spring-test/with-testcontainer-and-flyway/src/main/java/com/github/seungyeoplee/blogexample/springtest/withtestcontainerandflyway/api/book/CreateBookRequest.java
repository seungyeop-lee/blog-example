package com.github.seungyeoplee.blogexample.springtest.withtestcontainerandflyway.api.book;

import com.github.seungyeoplee.blogexample.springtest.withtestcontainerandflyway.domain.book.usecase.CreateBookCommand;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CreateBookRequest {

    @NotBlank
    private String title;

    @NotBlank
    private String isbn;

    @NotNull
    private LocalDate publishedDate;

    public CreateBookCommand toCommand() {
        return CreateBookCommand.of(title, isbn, publishedDate);
    }
}
