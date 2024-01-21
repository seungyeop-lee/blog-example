package com.github.seungyeop_lee.blog_example.good_code_bad_code.code7_dont_impl_info_in_exception.good;

public class TextImportanceScorerException extends RuntimeException {
    TextImportanceScorerException(Throwable cause) {
        super(cause);
    }
}
