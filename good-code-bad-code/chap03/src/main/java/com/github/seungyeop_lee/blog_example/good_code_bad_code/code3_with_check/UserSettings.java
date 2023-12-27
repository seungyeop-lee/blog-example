package com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_with_check;

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
        if (!haveSettingsBeenLoaded()) {
            throw new StateException("Settings not loaded");
        }
        // logic
    }

    private boolean haveSettingsBeenLoaded() {
        // check logic
        return false;
    }

    Color getUiColor() {
        if (!hasBennInitialized()) {
            throw new StateException("Settings not initialized");
        }
        // logic
        return null;
    }

    private boolean hasBennInitialized() {
        // check logic
        return false;
    }
}
