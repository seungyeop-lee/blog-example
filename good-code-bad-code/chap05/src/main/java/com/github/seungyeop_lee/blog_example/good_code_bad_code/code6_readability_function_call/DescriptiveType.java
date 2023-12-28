package com.github.seungyeop_lee.blog_example.good_code_bad_code.code6_readability_function_call;

public class DescriptiveType {

    private static class Client {
        public static void main(String[] args) {
            sendMessage("hello", new MessagePriority(1), RetryPolicy.ALLOW_RETRY);
        }
    }

    static void sendMessage(String message, MessagePriority priority, RetryPolicy retryPolicy) {
    }

    private static final class MessagePriority {
        MessagePriority(Integer priority) {
        }
    }

    private static enum RetryPolicy {
        ALLOW_RETRY,
        DISALLOW_RETRY
    }
}
