package com.github.seungyeop_lee.blog_example.good_code_bad_code.code7_dont_impl_info_in_exception.good;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code7_dont_impl_info_in_exception.common_stub.UserInterface;

class UseLogic {

    private final TextSummarizer textSummarizer;

    public UseLogic(TextSummarizer textSummarizer) {
        this.textSummarizer = textSummarizer;
    }

    void updateTextSummary(UserInterface ui) {
        String userText = ui.getUserText();

        try {
            String summary = textSummarizer.summarizeText(userText);
            ui.getSummaryField().setValue(summary);
        } catch (TextSummarizerException e) {
            ui.getSummaryField().setError("Unable to summarize text");
        }
    }
}
