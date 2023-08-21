package com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.api.book.exam001;

import com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.api.common.exception.ApiException;
import com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis.api.common.response.ExceptionApiResponse;

class Exceptions {
    static class ISBNDuplicationException extends ApiException {
        @Override
        public ExceptionApiResponse response() {
            return new ExceptionApiResponse("0002", "동일한 ISBN으로 등록 된 책이 있습니다.");
        }
    }
}
