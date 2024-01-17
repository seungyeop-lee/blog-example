package com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_immutable.mutable_class;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_immutable.stub.Font;

class UserDisplay {
    private final MessageBox messageBox;

    public UserDisplay(MessageBox messageBox) {
        this.messageBox = messageBox;
    }

    void sayHello() {
        TextOptions defaultStyle = new TextOptions(Font.ARIAL, 12.0);
        messageBox.renderTitle("Important message", defaultStyle);
        messageBox.renderMessage("Hello", defaultStyle);
    }
}
