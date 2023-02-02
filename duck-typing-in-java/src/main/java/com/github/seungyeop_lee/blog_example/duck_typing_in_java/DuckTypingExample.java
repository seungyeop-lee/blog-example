package com.github.seungyeop_lee.blog_example.duck_typing_in_java;

import static java.lang.Thread.sleep;

public class DuckTypingExample {
    public static void main(String[] args) throws InterruptedException {
        new Thread(new RunnableImpl()).start();
        new Thread(new MethodReferenceExample()::method).start();
        new Thread(MethodReferenceExample::staticMethod).start();
        sleep(100);
    }

    private static class RunnableImpl implements Runnable {
        @Override
        public void run() {
            System.out.println("RunnableImpl.run");
        }
    }

    private static class MethodReferenceExample {
        public void method() {
            System.out.println("MethodReferenceExample.method");
        }

        public static void staticMethod() {
            System.out.println("MethodReferenceExample.staticMethod");
        }
    }
}
