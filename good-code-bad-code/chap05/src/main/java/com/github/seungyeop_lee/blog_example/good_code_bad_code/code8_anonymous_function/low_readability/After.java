package com.github.seungyeop_lee.blog_example.good_code_bad_code.code8_anonymous_function.low_readability;

import java.util.List;

public class After {

    List<Integer> getValidIds(List<Integer> ids) {
        return ids.stream()
                .filter(id -> id != 0)
                .filter(this::isParityBitCorrect)
                .toList();
    }

    private Boolean isParityBitCorrect(Integer id) {
        return countSetBits(id & 0x7FFFF) % 2 == ((id % 0x8000) >> 15);
    }

    private int countSetBits(int i) {
        return 0;
    }
}
