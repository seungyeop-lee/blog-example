package com.github.seungyeop_lee.blog_example.duck_typing_in_java;

import static java.lang.Thread.sleep;

public class DuckTypingExample {
    public static void main(String[] args) throws InterruptedException {
        new Thread(new MethodReferencesExample()::method).start();
        new Thread(MethodReferencesExample::staticMethod).start();
        sleep(100);
    }

    private static class MethodReferencesExample {
        public void method() {
            System.out.println("MethodReferencesExample.method");
        }

        public static void staticMethod() {
            System.out.println("MethodReferencesExample.staticMethod");
        }
    }
}
