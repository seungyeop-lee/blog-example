package com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.api.common.exception;

import com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.api.common.response.ExceptionApiResponse;

public class RequiredValueException extends ApiException {
    @Override
    public ExceptionApiResponse response() {
        return new ExceptionApiResponse("0001", "필수 값이 누락되었습니다.");
    }
}
