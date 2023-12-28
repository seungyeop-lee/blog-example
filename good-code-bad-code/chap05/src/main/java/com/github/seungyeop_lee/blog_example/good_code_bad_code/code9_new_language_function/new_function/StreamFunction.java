package com.github.seungyeop_lee.blog_example.good_code_bad_code.code9_new_language_function.new_function;

import java.util.List;

public class StreamFunction {
    List<String> getNonEmptyStrings(List<String> strings) {
        return strings.stream()
                .filter(str -> !str.isEmpty())
                .toList();
    }
}
