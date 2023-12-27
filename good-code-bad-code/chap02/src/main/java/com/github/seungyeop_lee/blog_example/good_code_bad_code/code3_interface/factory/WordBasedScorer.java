package com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_interface.factory;

import java.util.List;

public class WordBasedScorer implements TextImportanceScorer {

    private static final Double IMPORTANCE_THRESHOLD = 1.0;

    @Override
    public Boolean isImportant(String text) {
        return calculateImportance(text) >= IMPORTANCE_THRESHOLD;
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
