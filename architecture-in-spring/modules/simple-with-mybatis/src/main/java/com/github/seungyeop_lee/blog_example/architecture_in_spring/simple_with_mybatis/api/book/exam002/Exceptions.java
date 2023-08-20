package com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.api.book.exam002;

import com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.api.common.exception.ApiException;
import com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.api.common.response.ExceptionApiResponse;

class Exceptions {
    public static class NotExistIdException extends ApiException {
        @Override
        public ExceptionApiResponse response() {
            return new ExceptionApiResponse("0003", "해당 ID는 등록되지 않았습니다.");
        }
    }
}
