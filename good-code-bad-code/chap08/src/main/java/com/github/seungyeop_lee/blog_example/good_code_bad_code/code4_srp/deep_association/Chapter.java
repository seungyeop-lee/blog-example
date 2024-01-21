package com.github.seungyeop_lee.blog_example.good_code_bad_code.code4_srp.deep_association;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code4_srp.common_stub.TextBlock;

import java.util.List;

interface Chapter {
    TextBlock getPrelude();

    List<TextBlock> getSections();
}
