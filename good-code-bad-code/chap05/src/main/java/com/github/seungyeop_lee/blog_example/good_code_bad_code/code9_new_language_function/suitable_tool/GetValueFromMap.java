package com.github.seungyeop_lee.blog_example.good_code_bad_code.code9_new_language_function.suitable_tool;

import java.util.Map;
import java.util.Optional;

public class GetValueFromMap {

    private Map<String, String> map;

    public void simple(String key) {
        String value = map.get(key);
    }

    public void stream(String key) {
        Optional<String> value = map.entrySet()
                .stream()
                .filter(entry -> entry.getKey().equals(key))
                .map(Map.Entry::getValue)
                .findFirst();
    }
}
