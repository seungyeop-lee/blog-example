package com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_descriptive_name;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NotDescriptive {

    private static class T {
        Set<String> pns = new HashSet<>();
        Integer s = 0;

        Boolean f(String n) {
            return pns.contains(n);
        }

        Integer getS() {
            return s;
        }
    }

    Integer s(List<T> ts, String n) {
        for (T t : ts) {
            if (t.f(n)) {
                return t.getS();
            }
        }

        return null;
    }
}
