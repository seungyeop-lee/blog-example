package com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_be_careful_inheritance.composition;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_be_careful_inheritance.common_stub.FileValueReader;

/**
 * Utility for reading integers from a file one-by-one.
 */
public class IntFileReader {

    private final FileValueReader fileValueReader;

    public IntFileReader(FileValueReader fileValueReader) {
        this.fileValueReader = fileValueReader;
    }

    public Integer getNextValueNumber() {
        String nextValue = fileValueReader.getNextValue();
        if (nextValue == null) {
            return null;
        }
        return Integer.parseInt(nextValue);
    }

    void close() {
        fileValueReader.close();
    }
}
