package com.github.seungyeoplee.blogexample.springtest.withtestcontainerandflyway.api.book;

import com.github.seungyeoplee.blogexample.springtest.withtestcontainerandflyway.domain.book.entity.Book;
import com.github.seungyeoplee.blogexample.springtest.withtestcontainerandflyway.domain.book.usecase.BookUsecase;
import com.github.seungyeoplee.blogexample.springtest.withtestcontainerandflyway.domain.book.usecase.CreateBookCommand;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {

    private final BookUsecase bookUsecase;

    @PostMapping
    public CreateBookResponse createBook(@RequestBody @Valid CreateBookRequest request) {
        CreateBookCommand command = request.toCommand();

        Book book = bookUsecase.createBook(command);

        return CreateBookResponse.from(book);
    }

    @GetMapping("/{id}")
    public ReadBookResponse readBook(@PathVariable Long id) {
        Book book = bookUsecase.findBook(id);

        return ReadBookResponse.from(book);
    }
}
