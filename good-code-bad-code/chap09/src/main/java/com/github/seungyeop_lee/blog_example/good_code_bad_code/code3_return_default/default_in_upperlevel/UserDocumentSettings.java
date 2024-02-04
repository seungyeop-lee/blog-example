package com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_return_default.default_in_upperlevel;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_return_default.stub.Font;

class UserDocumentSettings {
    private final Font font;

    public UserDocumentSettings(Font font) {
        this.font = font;
    }

    Font getPreferredFont() {
        return font;
    }
}
