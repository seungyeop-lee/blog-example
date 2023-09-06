package com.github.seungyeoplee.blogexample.springtest.withtestcontainerandflyway.domain.book.entity;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.time.LocalDate;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@Transactional
@Testcontainers
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class BookRepositoryTest {
    
    @Autowired
    private BookRepository bookRepository;

    @Test
    void saveAndFindByIdTest() {
        Book book = Book.of("테스트제목", "987654321", LocalDate.now());

        Book saved = bookRepository.save(book);

        assertThat(saved.getId()).isNotNull();

        Optional<Book> found = bookRepository.findById(saved.getId());

        assertThat(found.isPresent()).isTrue();
        assertThat(found.get())
                .extracting("title", "isbn", "publishedDate")
                .containsExactly(book.getTitle(), book.getIsbn(), book.getPublishedDate());
        assertThat(found.get().getCreatedAt()).isNotNull();
    }
}
