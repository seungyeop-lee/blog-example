package com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_immutable.mutable_class;

class MessageBox {
    private final TextFields titleFields;
    private final TextFields messageField;

    public MessageBox(TextFields titleFields, TextFields messageField) {
        this.titleFields = titleFields;
        this.messageField = messageField;
    }

    void renderTitle(String title, TextOptions baseStyle) {
        baseStyle.setFontSize(18.0);
        titleFields.display(title, baseStyle);
    }

    void renderMessage(String message, TextOptions style) {
        messageField.display(message, style);
    }
}
