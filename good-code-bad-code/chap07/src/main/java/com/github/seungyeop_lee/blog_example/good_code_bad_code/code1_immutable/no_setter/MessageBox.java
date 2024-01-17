package com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_immutable.no_setter;

class MessageBox {
    private final TextFields titleFields;
    private final TextFields messageField;

    public MessageBox(TextFields titleFields, TextFields messageField) {
        this.titleFields = titleFields;
        this.messageField = messageField;
    }

    void renderTitle(String title, TextOptions baseStyle) {
        titleFields.display(
                title,
                baseStyle.withFontSize(18.0)
        );
    }

    void renderMessage(String message, TextOptions style) {
        messageField.display(message, style);
    }
}
