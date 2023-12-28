package com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_dont_limit_line;

public class ShortButDifficult {
    Boolean isIdValid(int id) {
        return countSetBits(id & 0x7FFFF) % 2 == ((id & 0x8000) >> 15);
    }

    private int countSetBits(int i) {
        return 0;
    }
}
