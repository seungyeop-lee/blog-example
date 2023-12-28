package com.github.seungyeop_lee.blog_example.good_code_bad_code.code8_anonymous_function.long_function.stub;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
public class TextBox {
    private final String text;
    private final Border border;
    private final TextOptions options;
}
