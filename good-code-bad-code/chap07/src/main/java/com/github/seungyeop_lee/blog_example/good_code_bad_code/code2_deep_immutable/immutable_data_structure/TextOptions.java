package com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_deep_immutable.immutable_data_structure;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_deep_immutable.stub.Font;
import com.google.common.collect.ImmutableList;

public class TextOptions {
    private final ImmutableList<Font> fontFamily;
    private final Double fontSize;

    TextOptions(ImmutableList<Font> fontFamily, Double fontSize) {
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
    }

    ImmutableList<Font> getFontFamily() {
        return fontFamily;
    }

    Double getFontSize() {
        return fontSize;
    }
}
