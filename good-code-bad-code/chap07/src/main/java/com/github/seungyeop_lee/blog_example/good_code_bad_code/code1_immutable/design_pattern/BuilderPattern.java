package com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_immutable.design_pattern;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_immutable.stub.Font;

public class BuilderPattern {
    private static class TextOptions {
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
    }

    private static class TextOptionsBuilder {
        private final Font font;
        private Double fontSize;

        TextOptionsBuilder(Font font) {
            this.font = font;
        }

        TextOptionsBuilder setFontSize(Double fontSize) {
            this.fontSize = fontSize;
            return this;
        }

        TextOptions build() {
            return new TextOptions(font, fontSize);
        }
    }
}
