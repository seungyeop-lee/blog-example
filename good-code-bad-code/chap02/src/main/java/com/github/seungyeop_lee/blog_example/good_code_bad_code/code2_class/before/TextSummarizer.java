package com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_class.before;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class TextSummarizer {
    private static final Double IMPORTANCE_THRESHOLD = 1.0;

    String summarizeText(String text) {
        return splitIntoParagraphs(text)
                .stream()
                .filter(paragraph -> calculateImportance(paragraph) >= IMPORTANCE_THRESHOLD)
                .collect(Collectors.joining("\n\n"));
    }

    private List<String> splitIntoParagraphs(String text) {
        List<String> paragraphs = new ArrayList<>();
        Integer start = detectParagraphStartOffset(text, 0);
        while (start != null) {
            Integer end = detectParagraphEndOffset(text, start);
            if (end == null) {
                break;
            }
            paragraphs.add(text.substring(start, end));
            start = detectParagraphStartOffset(text, end);
        }
        return paragraphs;
    }

    private Integer detectParagraphStartOffset(String text, int fromOffset) {
        // 로직
        return null;
    }

    private Integer detectParagraphEndOffset(String text, Integer fromOffset) {
        // 로직
        return null;
    }

    private Double calculateImportance(String paragraph) {
        Double importanceScore = 0.0;
        List<String> nouns = extractImportantNouns(paragraph);
        List<String> verbs = extractImportantVerbs(paragraph);
        List<String> adjectives = extractImportantAdjectives(paragraph);
        // 그외 로직
        return importanceScore;
    }

    private List<String> extractImportantNouns(String paragraph) {
        // 로직
        return null;
    }

    private List<String> extractImportantVerbs(String paragraph) {
        // 로직
        return null;
    }

    private List<String> extractImportantAdjectives(String paragraph) {
        // 로직
        return null;
    }
}
