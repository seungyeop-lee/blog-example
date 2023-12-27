package com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_class.after;

import java.util.ArrayList;
import java.util.List;

class ParagraphFinder {
    public List<String> find(String text) {
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
}
