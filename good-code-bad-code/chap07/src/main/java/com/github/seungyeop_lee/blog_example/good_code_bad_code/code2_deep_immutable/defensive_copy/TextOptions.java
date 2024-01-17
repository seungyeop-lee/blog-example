package com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_deep_immutable.defensive_copy;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_deep_immutable.stub.Font;

import java.util.List;

public class TextOptions {
    private final List<Font> fontFamily;
    private final Double fontSize;

    TextOptions(List<Font> fontFamily, Double fontSize) {
        this.fontFamily = List.copyOf(fontFamily);
        this.fontSize = fontSize;
    }

    List<Font> getFontFamily() {
        return List.copyOf(fontFamily);
    }

    Double getFontSize() {
        return fontSize;
    }
}
