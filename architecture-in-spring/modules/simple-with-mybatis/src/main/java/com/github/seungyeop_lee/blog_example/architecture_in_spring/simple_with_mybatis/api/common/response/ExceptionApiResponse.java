package com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.api.common.response;

public class ExceptionApiResponse extends BaseApiResponse {
    public ExceptionApiResponse(String code, String message) {
        this.resultCode = code;
        this.resultMessage = message;
    }
}
