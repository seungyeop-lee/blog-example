package com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_be_careful_inheritance.inheritance;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_be_careful_inheritance.common_stub.CsvFileHandler;

import java.io.File;

class IntFileReader extends CsvFileHandler {

    IntFileReader(File file) {
        super(file);
    }

    public Integer getNextValueNumber() {
        String nextValue = getNextValue();
        if (nextValue == null) {
            return null;
        }
        return Integer.parseInt(nextValue);
    }
}
