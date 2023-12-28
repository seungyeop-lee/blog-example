package com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_dont_limit_line;

public class LongButUnderstandable {

    Boolean isIdValid(int id) {
        return extractEncodedParity(id) == calculateParity(getIdValue(id));
    }

    private static final int PARITY_BIT_INDEX = 15;
    private static final int PARITY_BIT_MASK = (1 << PARITY_BIT_INDEX);
    private static final int VALUE_BIT_MASK = ~PARITY_BIT_MASK;

    private int getIdValue(int id) {
        return id & VALUE_BIT_MASK;
    }

    private int extractEncodedParity(int id) {
        return (id & PARITY_BIT_MASK) >> PARITY_BIT_INDEX;
    }

    /**
     * 패리티 비트는 1인 비트의 수가
     * 짝수이면 0이고 홀수이면 1이다.
     */
    private int calculateParity(int value) {
        return countSetBits(value) % 2;
    }

    private int countSetBits(int value) {
        return 0;
    }
}
