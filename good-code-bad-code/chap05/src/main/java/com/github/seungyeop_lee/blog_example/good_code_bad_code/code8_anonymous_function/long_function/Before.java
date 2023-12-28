package com.github.seungyeop_lee.blog_example.good_code_bad_code.code8_anonymous_function.long_function;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code8_anonymous_function.long_function.stub.*;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code8_anonymous_function.stub.Feedback;

import java.util.List;

public class Before {
    private final UI ui;

    public Before(UI ui) {
        this.ui = ui;
    }

    void displayFeedback(List<Feedback> allFeedback) {
        ui.getFeedbackWidget()
                .setItems(buildFeedbackListItems(allFeedback));
    }

    private List<ListItem> buildFeedbackListItems(List<Feedback> allFeedback) {
        return allFeedback.stream()
                .map(feedback -> ListItem.builder()
                        .title(TextBox.builder()
                                .text(feedback.getTitle())
                                .options(TextOptions.builder()
                                        .weight(TextWeight.BOLD)
                                        .build())
                                .build())
                        .body(Column.builder()
                                .children(List.of(
                                        TextBox.builder()
                                                .text(feedback.getComment())
                                                .border(Border.builder()
                                                        .style(BorderStyle.DASHED)
                                                        .build())
                                                .build(),
                                        Row.builder()
                                                .children(feedback.getCategories().stream()
                                                        .map(category -> TextBox.builder()
                                                                .text(category.getLabel())
                                                                .options(TextOptions.builder()
                                                                        .style(TextStyle.ITALIC)
                                                                        .build())
                                                                .build())
                                                        .toList())
                                                .build()
                                ))
                                .build())
                        .build())
                .toList();
    }
}
