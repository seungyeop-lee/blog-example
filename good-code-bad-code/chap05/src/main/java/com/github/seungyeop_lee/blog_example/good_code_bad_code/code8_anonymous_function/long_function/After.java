package com.github.seungyeop_lee.blog_example.good_code_bad_code.code8_anonymous_function.long_function;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code8_anonymous_function.long_function.stub.*;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code8_anonymous_function.stub.Category;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code8_anonymous_function.stub.Feedback;

import java.util.List;

public class After {
    private final UI ui;

    public After(UI ui) {
        this.ui = ui;
    }

    void displayFeedback(List<Feedback> allFeedback) {
        ui.getFeedbackWidget()
                .setItems(buildFeedbackListItems(allFeedback));
    }

    private List<ListItem> buildFeedbackListItems(List<Feedback> allFeedback) {
        return allFeedback.stream()
                .map(this::buildFeedbackItem)
                .toList();
    }

    private ListItem buildFeedbackItem(Feedback feedback) {
        return ListItem.builder()
                .title(buildTitle(feedback.getTitle()))
                .body(Column.builder()
                        .children(List.of(
                                buildCommentText(feedback.getComment()),
                                buildCategories(feedback.getCategories())
                        ))
                        .build())
                .build();
    }

    private static TextBox buildTitle(String title) {
        return TextBox.builder()
                .text(title)
                .options(TextOptions.builder()
                        .weight(TextWeight.BOLD)
                        .build())
                .build();
    }

    private TextBox buildCommentText(String comment) {
        return TextBox.builder()
                .text(comment)
                .border(Border.builder()
                        .style(BorderStyle.DASHED)
                        .build())
                .build();
    }

    private Row buildCategories(List<Category> categories) {
        return Row.builder()
                .children(categories.stream()
                        .map(this::buildCategory)
                        .toList())
                .build();
    }

    private TextBox buildCategory(Category category) {
        return TextBox.builder()
                .text(category.getLabel())
                .options(TextOptions.builder()
                        .style(TextStyle.ITALIC)
                        .build())
                .build();
    }
}
