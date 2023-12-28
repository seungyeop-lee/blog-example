package com.github.seungyeop_lee.blog_example.good_code_bad_code.code6_readability_function_call;

public class DifficultParameter {

    private static class Client {
        public static void main(String[] args) {
            DifficultParameter.sendMessage("hello", 1, true);
        }
    }

    static void sendMessage(String message, Integer priority, Boolean allowRetry) {
    }
}
