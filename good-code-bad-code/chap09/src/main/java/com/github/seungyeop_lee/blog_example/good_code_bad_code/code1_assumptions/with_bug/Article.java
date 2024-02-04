package com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_assumptions.with_bug;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_assumptions.stub.Image;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_assumptions.stub.Section;

import java.util.List;

public class Article {
    private List<Section> sections;

    List<Image> getAllImages() {
        for (Section section : sections) {
            if (section.containsImages()) {
                // 기사 내에 이미지를 포함하는 섹션은 최대하나만 있다.
                return section.getImages();
            }
        }
        return List.of();
    }
}
