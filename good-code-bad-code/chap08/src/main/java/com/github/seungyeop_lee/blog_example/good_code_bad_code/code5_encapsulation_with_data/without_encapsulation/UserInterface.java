package com.github.seungyeop_lee.blog_example.good_code_bad_code.code5_encapsulation_with_data.without_encapsulation;

class UserInterface {

    private final TextBox textBox;
    private final UiSettings uiSettings;

    public UserInterface(TextBox textBox, UiSettings uiSettings) {
        this.textBox = textBox;
        this.uiSettings = uiSettings;
    }

    void displayMessage(String message) {
        textBox.renderText(
                message,
                uiSettings.getFont(),
                uiSettings.getFontSize(),
                uiSettings.getLineHeight(),
                uiSettings.getTextColor()
        );
    }
}
