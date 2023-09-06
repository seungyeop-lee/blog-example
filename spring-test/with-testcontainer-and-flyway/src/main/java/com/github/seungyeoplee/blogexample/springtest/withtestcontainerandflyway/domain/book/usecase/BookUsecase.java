package com.github.seungyeoplee.blogexample.springtest.withtestcontainerandflyway.domain.book.usecase;

import com.github.seungyeoplee.blogexample.springtest.withtestcontainerandflyway.domain.book.entity.Book;
import com.github.seungyeoplee.blogexample.springtest.withtestcontainerandflyway.domain.book.entity.BookRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class BookUsecase {

    private final BookRepository bookRepository;

    public Book createBook(CreateBookCommand command) {
        Book saved = bookRepository.save(command.toEntity());
        return saved;
    }

    public Book findBook(Long id) {
        Book found = bookRepository.findById(id)
                .orElseThrow(EntityNotFoundException::new);
        return found;
    }
}
