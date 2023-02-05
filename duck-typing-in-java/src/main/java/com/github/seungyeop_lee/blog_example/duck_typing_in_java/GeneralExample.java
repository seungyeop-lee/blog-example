package com.github.seungyeop_lee.blog_example.duck_typing_in_java;

import static java.lang.Thread.sleep;

public class GeneralExample {
    public static void main(String[] args) throws InterruptedException {
        new Thread(new RunnableImpl()).start();
        sleep(100);
    }

    private static class RunnableImpl implements Runnable {
        @Override
        public void run() {
            System.out.println("RunnableImpl.run");
        }
    }
}
