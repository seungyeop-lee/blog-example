package com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.api.book.exam001;

import com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.entity.Book;
import com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.entity.BookExample;
import com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.entity.BookMapper;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
class EXAM001Service {

    private final BookMapper bookMapper;

    public Result createBook(Command command) {
        checkIsbnDuplication(command);

        Book book = command.bookForInsert();
        bookMapper.insert(book);

        return Result.from(book);
    }

    private void checkIsbnDuplication(Command command) {
        BookExample example = new BookExample();
        example.createCriteria().andIsbnEqualTo(command.getIsbn());

        List<Book> books = bookMapper.selectByExample(example);
        if (!books.isEmpty()) {
            throw new Exceptions.ISBNDuplicationException();
        }
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

        public Book bookForInsert() {
            Book book = new Book();
            book.setTitle(title);
            book.setIsbn(isbn);
            book.setPublishedDate(publishedDate);
            return book;
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
