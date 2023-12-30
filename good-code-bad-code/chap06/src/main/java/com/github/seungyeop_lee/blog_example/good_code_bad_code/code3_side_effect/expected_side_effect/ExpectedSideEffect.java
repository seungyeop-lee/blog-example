package com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_side_effect.expected_side_effect;

public class ExpectedSideEffect {
    private static class UserDisplay {
        private final Canvas canvas;

        private UserDisplay(Canvas canvas) {
            this.canvas = canvas;
        }

        void displayErrorMessage(String message) {
            canvas.drawText(message, Color.RED);
        }
    }
}
