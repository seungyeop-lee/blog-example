package com.github.seungyeop_lee.blog_example.good_code_bad_code.code5_encapsulation_with_data.with_encapsulation;

public class UserInterface {

    private final TextBox messageBox;
    private final UiSettings uiSettings;

    public UserInterface(TextBox messageBox, UiSettings uiSettings) {
        this.messageBox = messageBox;
        this.uiSettings = uiSettings;
    }

    void displayMessage(String message) {
        messageBox.renderText(
                message,
                uiSettings.getTextStyle()
        );
    }
}
