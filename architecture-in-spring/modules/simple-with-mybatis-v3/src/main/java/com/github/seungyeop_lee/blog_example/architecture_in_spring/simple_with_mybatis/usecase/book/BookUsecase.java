package com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.usecase.book;

import com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.entity.Book;
import com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.entity.BookExample;
import com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.entity.BookMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class BookUsecase {

    private final BookMapper bookMapper;

    public Book createBook(CreateBookCommand command) {
        Book book = new Book()
                .withTitle(command.getTitle())
                .withIsbn(command.getIsbn())
                .withPublishedDate(command.getPublishedDate());

        bookMapper.insert(book);

        return book;
    }

    public Optional<Book> findById(Long bookId) {
        Book book = bookMapper.selectByPrimaryKey(bookId);
        if (book == null) {
            return Optional.empty();
        } else {
            return Optional.of(book);
        }
    }

    public Optional<Book> findByIsbn(String isbn) {
        BookExample example = new BookExample();
        example.createCriteria().andIsbnEqualTo(isbn);

        List<Book> books = bookMapper.selectByExample(example);
        if (books.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(books.get(0));
        }
    }
}
