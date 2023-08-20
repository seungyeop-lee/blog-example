package com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.api.book.exam002;

import com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.entity.Book;
import com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.entity.BookMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class EXAM002Service {

    private final BookMapper bookMapper;

    public void readBook(DataManager dataManager) {
        Book book = bookMapper.selectByPrimaryKey(dataManager.getBookId());
        if (book == null) {
            throw new Exceptions.NotExistIdException();
        }

        dataManager.setBook(book);
    }
}
