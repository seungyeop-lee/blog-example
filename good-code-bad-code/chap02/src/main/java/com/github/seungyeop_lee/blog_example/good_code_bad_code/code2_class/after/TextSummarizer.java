package com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_class.after;

import java.util.stream.Collectors;

class TextSummarizer {
    private final ParagraphFinder paragraphFinder;
    private final TextImportanceScorer importanceScorer;

    public TextSummarizer(ParagraphFinder paragraphFinder, TextImportanceScorer importanceScorer) {
        this.paragraphFinder = paragraphFinder;
        this.importanceScorer = importanceScorer;
    }

    static TextSummarizer createDefault() {
        return new TextSummarizer(
                new ParagraphFinder(),
                new TextImportanceScorer()
        );
    }

    String summarizeText(String text) {
        return paragraphFinder.find(text)
                .stream()
                .filter(importanceScorer::isImportant)
                .collect(Collectors.joining("\n\n"));
    }
}
