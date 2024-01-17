package com.github.seungyeop_lee.blog_example.good_code_bad_code.code6_source_of_truth_for_logic.before;

import java.util.List;
import java.util.stream.Collectors;

public class DataLogger {

    private final List<Integer> loggedValues;

    public DataLogger(List<Integer> loggedValues) {
        this.loggedValues = loggedValues;
    }

    void saveValues(FileHandler file) {
        String serializedValues = loggedValues.stream()
                .map(value -> Integer.toString(value, 10))
                .collect(Collectors.joining(","));
        file.write(serializedValues);
    }
}
