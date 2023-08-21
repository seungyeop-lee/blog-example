package com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.api.book.exam001;

import com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.entity.Book;
import com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.entity.BookExample;
import com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.entity.BookMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
class EXAM001Service {

    private final BookMapper bookMapper;

    public void createBook(DataManager dataManager) {
        checkIsbnDuplication(dataManager);

        Book book = dataManager.bookForInsert();
        bookMapper.insert(book);

        dataManager.setBook(book);
    }

    private void checkIsbnDuplication(DataManager dataManager) {
        BookExample example = new BookExample();
        example.createCriteria().andIsbnEqualTo(dataManager.getIsbn());

        List<Book> books = bookMapper.selectByExample(example);
        if (!books.isEmpty()) {
            throw new Exceptions.ISBNDuplicationException();
        }
    }
}
