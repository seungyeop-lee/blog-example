package com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_be_careful_inheritance.inheritance;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_be_careful_inheritance.common_stub.SemicolonFileHandler;

import java.io.File;

/**
 * 파일로부터 정수를 하나씩 읽어 들이기 위한 유틸리티
 * 파일은 세미콜론으로 구분된 값을 가지고 있다.
 */
public class SemicolonIntFileReader extends SemicolonFileHandler {

    SemicolonIntFileReader(File file) {
        super(file);
    }

    Integer getNextIntNumber() {
        String nextValue = getNextValue();
        if (nextValue == null) {
            return null;
        }
        return Integer.parseInt(nextValue);
    }

}
