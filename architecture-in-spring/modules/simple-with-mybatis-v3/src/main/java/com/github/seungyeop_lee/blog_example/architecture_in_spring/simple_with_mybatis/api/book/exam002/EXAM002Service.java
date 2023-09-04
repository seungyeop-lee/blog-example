package com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.api.book.exam002;

import com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.entity.Book;
import com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.usecase.book.BookUsecase;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Service
@Transactional
@RequiredArgsConstructor
public class EXAM002Service {

    private final BookUsecase bookUsecase;

    public Result readBook(Command command) {
        Book book = bookUsecase
                .findById(command.getBookId())
                .orElseThrow(Exceptions.NotExistIdException::new);
        return Result.from(book);
    }

    @Getter
    static class Command {
        private Long bookId;

        public static Command of(Long bookId) {
            Command command = new Command();
            command.bookId = bookId;
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
