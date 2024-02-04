package com.github.seungyeop_lee.blog_example.good_code_bad_code.code5_generic.use;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomizedQueue<T> {
    private final List<T> values = new ArrayList<>();

    void add(T value) {
        values.add(value);
    }

    /**
     * 큐로부터 무작위로 한 항목을 삭제하고 그 항목을 반환한다.
     */
    T getNext() {
        if (values.isEmpty()) {
            return null;
        }
        int randomIndex = new Random().nextInt(0, values.size());
        Collections.swap(values, randomIndex, values.size() - 1);
        return values.removeLast();
    }
}
