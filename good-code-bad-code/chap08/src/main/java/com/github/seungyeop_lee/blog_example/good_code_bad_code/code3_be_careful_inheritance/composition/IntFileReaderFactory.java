package com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_be_careful_inheritance.composition;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_be_careful_inheritance.common_stub.CsvFileHandler;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_be_careful_inheritance.common_stub.SemicolonFileHandler;

import java.io.File;

public class IntFileReaderFactory {

    IntFileReader createIntFileReader(File file) {
        return new IntFileReader(new CsvFileHandler(file));
    }

    IntFileReader createSemicolonIntFileReader(File file) {
        return new IntFileReader(new SemicolonFileHandler(file));
    }
}
