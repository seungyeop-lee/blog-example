package com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_immutable.design_pattern;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_immutable.stub.Font;

public class CopyOnWritePattern {
    private static class TextOptions {
        private final Font font;
        private final Double fontSize;

        TextOptions(Font font) {
            this(font, null);
        }

        private TextOptions(Font font, Double fontSize) {
            this.font = font;
            this.fontSize = fontSize;
        }

        Font getFont() {
            return font;
        }

        Double getFontSize() {
            return fontSize;
        }

        TextOptions withFont(Font newFont) {
            return new TextOptions(newFont, fontSize);
        }

        TextOptions withFontSize(Double newFontSize) {
            return new TextOptions(font, newFontSize);
        }
    }
}
