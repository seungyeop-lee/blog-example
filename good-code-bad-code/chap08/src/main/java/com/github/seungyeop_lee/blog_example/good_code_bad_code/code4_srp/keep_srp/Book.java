package com.github.seungyeop_lee.blog_example.good_code_bad_code.code4_srp.keep_srp;

import java.util.List;

class Book {
    private final List<Chapter> chapters;

    public Book(List<Chapter> chapters) {
        this.chapters = chapters;
    }

    Integer wordCount() {
        return chapters.stream()
                .mapToInt(Chapter::wordCount)
                .sum();
    }
}
