package com.github.seungyeop_lee.blog_example.good_code_bad_code.code9_new_language_function.new_function;

import java.util.ArrayList;
import java.util.List;

public class TraditionalJava {
    List<String> getNonEmptyStrings(List<String> strings) {
        List<String> nonEmptyStrings = new ArrayList<>();
        for (String str : strings) {
            if (!str.isEmpty()) {
                nonEmptyStrings.add(str);
            }
        }
        return nonEmptyStrings;
    }
}
