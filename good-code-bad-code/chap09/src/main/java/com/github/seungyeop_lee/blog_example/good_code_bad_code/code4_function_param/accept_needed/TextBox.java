package com.github.seungyeop_lee.blog_example.good_code_bad_code.code4_function_param.accept_needed;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code4_function_param.stub.Color;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code4_function_param.stub.Element;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code4_function_param.stub.TextOptions;

class TextBox {

    private final Element textContainer;

    public TextBox(Element textContainer) {
        this.textContainer = textContainer;
    }

    void setTextStyle(TextOptions options) {
//        setFont();
//        setFontSize();
//        setLineHeight();
        setTextColor(options.getTextColor());
    }

    public void setTextColor(Color color) {
        textContainer.setTypeProperty("color", color.asHexRgb());
    }
}
