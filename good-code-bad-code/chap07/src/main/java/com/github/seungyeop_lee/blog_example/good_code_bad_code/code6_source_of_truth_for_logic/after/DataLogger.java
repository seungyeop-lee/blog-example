package com.github.seungyeop_lee.blog_example.good_code_bad_code.code6_source_of_truth_for_logic.after;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code6_source_of_truth_for_logic.before.FileHandler;

import java.util.List;

public class DataLogger {

    private final List<Integer> loggedValues;
    private final IntListFormat intListFormat;

    public DataLogger(List<Integer> loggedValues, IntListFormat intListFormat) {
        this.loggedValues = loggedValues;
        this.intListFormat = intListFormat;
    }

    void saveValues(FileHandler file) {
        file.write(intListFormat.serialize(loggedValues));
    }
}
