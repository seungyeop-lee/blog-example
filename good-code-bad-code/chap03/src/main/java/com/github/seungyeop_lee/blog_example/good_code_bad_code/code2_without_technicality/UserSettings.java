package com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_without_technicality;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.stub.Color;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.stub.File;

public class UserSettings {

    private UserSettings() {
    }

    static UserSettings create(File location) {
        UserSettings settings = new UserSettings();
        if (!settings.loadSettings(location)) {
            return null;
        }
        settings.init();
        return settings;
    }

    private Boolean loadSettings(File location) {
        // logic
        return false;
    }

    private void init() {
        // logic
    }

    Color getUiColor() {
        // logic
        return null;
    }
}
