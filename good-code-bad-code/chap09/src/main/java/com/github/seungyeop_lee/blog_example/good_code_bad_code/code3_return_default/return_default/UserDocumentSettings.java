package com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_return_default.return_default;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_return_default.stub.Font;

class UserDocumentSettings {
    private final Font font;

    public UserDocumentSettings(Font font) {
        this.font = font;
    }

    Font getPreferredFont() {
        if (font != null) {
            return font;
        }
        return Font.ARIAL;
    }
}
