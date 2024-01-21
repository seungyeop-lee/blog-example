package com.github.seungyeop_lee.blog_example.good_code_bad_code.code4_srp.keep_srp;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code4_srp.common_stub.TextBlock;

import java.util.List;

interface Chapter {
    TextBlock getPrelude();

    List<TextBlock> getSections();

    default Integer wordCount() {
        return getPrelude().wordCount() +
                getSections()
                        .stream()
                        .mapToInt(TextBlock::wordCount)
                        .sum();
    }
}
