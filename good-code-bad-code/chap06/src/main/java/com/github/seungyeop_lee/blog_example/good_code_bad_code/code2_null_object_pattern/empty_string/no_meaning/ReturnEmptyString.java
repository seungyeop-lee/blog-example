package com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_null_object_pattern.empty_string.no_meaning;

public class ReturnEmptyString {
    private static class UserFeedback {
        private String additionalComments;

        String getAdditionalComments() {
            if (additionalComments == null) {
                return "";
            }
            return additionalComments;
        }
    }
}
