package com.github.seungyeop_lee.blog_example.good_code_bad_code.code5_encapsulation_with_data.without_encapsulation;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code5_encapsulation_with_data.common_stub.Color;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code5_encapsulation_with_data.common_stub.Font;

interface UiSettings {
    Font getFont();

    Double getFontSize();

    Double getLineHeight();

    Color getTextColor();
}
