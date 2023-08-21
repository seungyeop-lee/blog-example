package com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.api.common;

import com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.api.common.exception.ApiException;
import com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.api.common.response.ExceptionApiResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalControllerAdvisor {
    @ExceptionHandler(ApiException.class)
    public ExceptionApiResponse handleApiException(ApiException exception) {
        return exception.response();
    }
}
