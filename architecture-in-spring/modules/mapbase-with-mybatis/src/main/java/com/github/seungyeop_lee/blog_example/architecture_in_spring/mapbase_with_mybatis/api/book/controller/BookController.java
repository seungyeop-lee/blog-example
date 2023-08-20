package com.github.seungyeop_lee.blog_example.architecture_in_spring.mapbase_with_mybatis.api.book.controller;

import com.github.seungyeop_lee.blog_example.architecture_in_spring.mapbase_with_mybatis.api.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    /**
     * EXAM001
     */
    @PostMapping("/createBook")
    public Map<String, Object> createBook(@RequestBody Map<String, Object> data) {
        return bookService.create(data);
    }

    /**
     * EXAM002
     */
    @PostMapping("/readBook")
    public Map<String, Object> readBook(@RequestBody Map<String, Object> data) {
        return bookService.readById(data);
    }
}
