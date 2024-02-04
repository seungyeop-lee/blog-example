package com.github.seungyeop_lee.blog_example.good_code_bad_code.code4_function_param.accept_with_unuse;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code4_function_param.stub.Color;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code4_function_param.stub.Font;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code4_function_param.stub.TextOptions;


public class Main {
    void styleAsWarning(TextBox textBox) {
        TextOptions style = new TextOptions(
                Font.ARIAL,
                12.0,
                14.0,
                Color.RED
        );
        textBox.setTextStyle(style);
    }
}
