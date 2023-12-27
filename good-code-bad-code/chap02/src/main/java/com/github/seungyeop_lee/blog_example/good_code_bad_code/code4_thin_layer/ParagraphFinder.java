package com.github.seungyeop_lee.blog_example.good_code_bad_code.code4_thin_layer;

import java.util.ArrayList;
import java.util.List;

class ParagraphFinder {
    private final OffsetDetector startDetector;
    private final OffsetDetector endDetector;

    public ParagraphFinder(OffsetDetector startDetector, OffsetDetector endDetector) {
        this.startDetector = startDetector;
        this.endDetector = endDetector;
    }

    public List<String> find(String text) {
        List<String> paragraphs = new ArrayList<>();
        Integer start = startDetector.detectOffset(text, 0);
        while (start != null) {
            Integer end = endDetector.detectOffset(text, start);
            if (end == null) {
                break;
            }
            paragraphs.add(text.substring(start, end));
            start = startDetector.detectOffset(text, end);
        }
        return paragraphs;
    }
}
