package com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_global_state.basic_example;

public class MyClass {
    private int a = 3;
    private static int b = 4;

    void setA(int value) {
        a = value;
    }

    int getA() {
        return a;
    }

    void setB(int value) {
        b = value;
    }

    int getB() {
        return b;
    }

    static int getBStatically() {
        return b;
    }
}
