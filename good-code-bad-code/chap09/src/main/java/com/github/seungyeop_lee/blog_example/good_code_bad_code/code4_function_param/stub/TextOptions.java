package com.github.seungyeop_lee.blog_example.good_code_bad_code.code4_function_param.stub;

public class TextOptions {
    private final Font font;
    private final Double fontSize;
    private final Double lineHeight;
    private final Color textColor;

    public TextOptions(
            Font font,
            Double fontSize,
            Double lineHeight,
            Color textColor
    ) {
        this.font = font;
        this.fontSize = fontSize;
        this.lineHeight = lineHeight;
        this.textColor = textColor;
    }

    public Font getFont() {
        return font;
    }

    public Double getFontSize() {
        return fontSize;
    }

    public Double getLineHeight() {
        return lineHeight;
    }

    public Color getTextColor() {
        return textColor;
    }
}

