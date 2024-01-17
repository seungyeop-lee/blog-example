package com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_immutable.mutable_class;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_immutable.stub.Font;

class TextOptions {
    private Font font;
    private Double fontSize;

    public TextOptions(Font font, Double fontSize) {
        this.font = font;
        this.fontSize = fontSize;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public void setFontSize(Double fontSize) {
        this.fontSize = fontSize;
    }

    public Font getFont() {
        return font;
    }

    public Double getFontSize() {
        return fontSize;
    }
}
