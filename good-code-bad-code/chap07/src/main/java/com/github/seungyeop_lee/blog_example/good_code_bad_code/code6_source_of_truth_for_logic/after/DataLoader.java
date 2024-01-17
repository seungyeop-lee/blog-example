package com.github.seungyeop_lee.blog_example.good_code_bad_code.code6_source_of_truth_for_logic.after;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code6_source_of_truth_for_logic.before.FileHandler;

import java.util.List;

public class DataLoader {

    private final IntListFormat intListFormat;

    public DataLoader(IntListFormat intListFormat) {
        this.intListFormat = intListFormat;
    }

    List<Integer> loadValues(FileHandler file) {
        return intListFormat.deserialize(file.readAsString());
    }
}
