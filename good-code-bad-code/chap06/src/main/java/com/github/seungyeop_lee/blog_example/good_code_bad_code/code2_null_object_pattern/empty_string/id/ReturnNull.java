package com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_null_object_pattern.empty_string.id;

public class ReturnNull {
    private static class Payment {
        private final String cardTransactionId;

        private Payment(String cardTransactionId) {
            this.cardTransactionId = cardTransactionId;
        }

        String getCardTransactionId() {
            return cardTransactionId;
        }
    }
}
