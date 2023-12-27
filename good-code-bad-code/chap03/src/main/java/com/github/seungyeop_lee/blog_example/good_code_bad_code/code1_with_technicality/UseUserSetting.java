package com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_with_technicality;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.stub.Color;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.stub.UI;

public class UseUserSetting {

    private final UI ui;
    private Color DEFAULT_UI_COLOR = Color.DEFAULT;

    public UseUserSetting(UI ui) {
        this.ui = ui;
    }

    void setUiColor(UserSettings userSettings) {
        Color chosenColor = userSettings.getUiColor();
        if (chosenColor == null) {
            ui.setColor(DEFAULT_UI_COLOR);
            return;
        }

        ui.setColor(chosenColor);
    }
}
