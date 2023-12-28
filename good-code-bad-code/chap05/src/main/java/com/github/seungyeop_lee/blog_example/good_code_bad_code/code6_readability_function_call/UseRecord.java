package com.github.seungyeop_lee.blog_example.good_code_bad_code.code6_readability_function_call;

import lombok.Builder;

public class UseRecord {

    private static class Client {
        public static void main(String[] args) {
            sendMessage(
                    SendMessageParams.builder()
                            .message("hello")
                            .priority(1)
                            .allowRetry(true)
                            .build()
            );
        }
    }

    static void sendMessage(SendMessageParams params) {
    }

    @Builder
    record SendMessageParams(
            String message,
            Integer priority,
            Boolean allowRetry
    ) {
    }
}
