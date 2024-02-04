package com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_return_default.default_in_upperlevel;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_return_default.stub.Font;

class DocumentSettings {

    private final UserDocumentSettings userSettings;
    private final DefaultDocumentSettings defaultSettings;

    DocumentSettings(UserDocumentSettings userSettings, DefaultDocumentSettings defaultSettings) {
        this.userSettings = userSettings;
        this.defaultSettings = defaultSettings;
    }

    Font getFont() {
        Font userFont = userSettings.getPreferredFont();
        if (userFont != null) {
            return userFont;
        }
        return defaultSettings.getFont();
    }
}
