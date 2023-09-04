package com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.api.book.exam001;

import com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.entity.Book;
import com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.usecase.book.BookUsecase;
import com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.usecase.book.CreateBookCommand;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Service
@Transactional
@RequiredArgsConstructor
class EXAM001Service {

    private final BookUsecase bookUsecase;

    public Result createBook(Command command) {
        if (bookUsecase.findByIsbn(command.getIsbn()).isPresent()) {
            throw new Exceptions.ISBNDuplicationException();
        }

        Book book = bookUsecase.createBook(
                CreateBookCommand.of(
                        command.getTitle(),
                        command.getIsbn(),
                        command.getPublishedDate()
                )
        );

        return Result.from(book);
    }

    @Getter
    static class Command {
        private String title;
        private String isbn;
        private LocalDate publishedDate;

        public static Command of(
                String title,
                String isbn,
                LocalDate publishedDate
        ) {
            Command command = new Command();
            command.title = title;
            command.isbn = isbn;
            command.publishedDate = publishedDate;
            return command;
        }
    }

    @Getter
    static class Result {
        private Long bookId;
        private String title;
        private String isbn;
        private LocalDate publishedDate;

        public static Result from(Book book) {
            Result result = new Result();
            result.bookId = book.getBookId();
            result.title = book.getTitle();
            result.isbn = book.getIsbn();
            result.publishedDate = book.getPublishedDate();
            return result;
        }
    }
}
