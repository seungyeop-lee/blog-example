package com.github.seungyeop_lee.blog_example.architecture_in_spring.mapbase_with_mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface BookMapper {
    Map<String, Object> readById(Long bookId);

    Map<String, Object> readByIsbn(String isbn);

    int create(Map<String, Object> data);
}
