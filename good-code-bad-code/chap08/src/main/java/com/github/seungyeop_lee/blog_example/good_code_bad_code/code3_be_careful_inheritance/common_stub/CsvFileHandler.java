package com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_be_careful_inheritance.common_stub;

import java.io.File;

public class CsvFileHandler implements FileValueReader, FileValueWriter {
    public CsvFileHandler(File file) {
    }


    @Override
    public String getNextValue() {
        return null;
    }

    @Override
    public void writeValue(String value) {
    }

    @Override
    public void close() {

    }
}
