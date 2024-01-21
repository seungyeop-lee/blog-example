package com.github.seungyeop_lee.blog_example.good_code_bad_code.code4_srp.deep_association;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code4_srp.common_stub.TextBlock;

import java.util.List;

class Book {
    private final List<Chapter> chapters;

    public Book(List<Chapter> chapters) {
        this.chapters = chapters;
    }

    Integer wordCount() {
        return chapters.stream()
                .mapToInt(this::getChapterWordCount)
                .sum();
    }

    private int getChapterWordCount(Chapter chapter) {
        return chapter.getPrelude().wordCount() +
                chapter.getSections()
                        .stream()
                        .mapToInt(TextBlock::wordCount)
                        .sum();
    }
}
