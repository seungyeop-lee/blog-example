package com.github.seungyeop_lee.blog_example.good_code_bad_code.code8_anonymous_function.simple_logic;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code8_anonymous_function.stub.Feedback;

import java.util.List;

public class SimpleLogic {
    List<Feedback> getUsefulFeedback(List<Feedback> allFeedback) {
        return allFeedback.stream()
                .filter(feedback -> !feedback.getComment().isEmpty())
                .toList();
    }
}
