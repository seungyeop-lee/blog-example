package com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_global_state.basic_example;

public class Main {
    public static void main(String[] args) {
        MyClass instance1 = new MyClass();
        MyClass instance2 = new MyClass();

        instance1.setA(5);
        instance2.setA(7);
        print(instance1.getA()); // 출력: 5
        print(instance2.getA()); // 출력: 7
        instance1.setB(6);
        instance2.setB(8);
        print(instance1.getB()); // 출력: 8
        print(instance2.getB()); // 출력: 8
        print(MyClass.getBStatically()); // 출력: 8
    }

    public static void print(Object object) {
        System.out.println(object);
    }
}
