package com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_immutable.no_setter;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_immutable.stub.Font;

class TextOptions {
    private final Font font;
    private final Double fontSize;

    public TextOptions(Font font, Double fontSize) {
        this.font = font;
        this.fontSize = fontSize;
    }

    public Font getFont() {
        return font;
    }

    public Double getFontSize() {
        return fontSize;
    }

    public TextOptions withFontSize(double fontSize) {
        return new TextOptions(font, fontSize);
    }
}
