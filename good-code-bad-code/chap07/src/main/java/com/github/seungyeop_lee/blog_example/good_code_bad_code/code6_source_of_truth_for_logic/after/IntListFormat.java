package com.github.seungyeop_lee.blog_example.good_code_bad_code.code6_source_of_truth_for_logic.after;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class IntListFormat {

    private final String DELIMITER = ",";
    private final Integer RADIX = 10;

    String serialize(List<Integer> values) {
        return values
                .stream()
                .map(value -> Integer.toString(value, RADIX))
                .collect(Collectors.joining(DELIMITER));
    }

    List<Integer> deserialize(String serialized) {
        return Arrays
                .stream(serialized.split(","))
                .map(str -> Integer.parseInt(str, 10))
                .toList();
    }
}
