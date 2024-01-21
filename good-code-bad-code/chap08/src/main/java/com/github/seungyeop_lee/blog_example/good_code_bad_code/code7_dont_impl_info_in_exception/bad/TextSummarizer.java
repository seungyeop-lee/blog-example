package com.github.seungyeop_lee.blog_example.good_code_bad_code.code7_dont_impl_info_in_exception.bad;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code7_dont_impl_info_in_exception.common_stub.ParagraphFinder;

import java.util.stream.Collectors;

class TextSummarizer {

    private final TextImportanceScorer importanceScorer;
    private final ParagraphFinder paragraphFinder;

    public TextSummarizer(TextImportanceScorer importanceScorer, ParagraphFinder paragraphFinder) {
        this.importanceScorer = importanceScorer;
        this.paragraphFinder = paragraphFinder;
    }

    String summarizeText(String text) {
        return paragraphFinder.find(text)
                .stream()
                .filter(importanceScorer::isImportant)
                .collect(Collectors.joining("\n\n"));
    }
}
