package com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.api.common.exception;

import com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.api.common.response.ExceptionApiResponse;

public abstract class ApiException extends RuntimeException {
    public abstract ExceptionApiResponse response();
}
