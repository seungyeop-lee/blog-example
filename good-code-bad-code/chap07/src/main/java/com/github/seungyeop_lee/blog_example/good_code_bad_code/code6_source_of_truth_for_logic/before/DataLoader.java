package com.github.seungyeop_lee.blog_example.good_code_bad_code.code6_source_of_truth_for_logic.before;

import java.util.Arrays;
import java.util.List;

public class DataLoader {

    List<Integer> loadValues(FileHandler file) {
        return Arrays.stream(file.readAsString()
                        .split(","))
                .map(str -> Integer.parseInt(str, 10))
                .toList();
    }
}
