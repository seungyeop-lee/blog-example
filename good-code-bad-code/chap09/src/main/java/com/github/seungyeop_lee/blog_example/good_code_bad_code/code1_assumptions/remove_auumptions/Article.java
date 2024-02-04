package com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_assumptions.remove_auumptions;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_assumptions.stub.Image;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_assumptions.stub.Section;

import java.util.ArrayList;
import java.util.List;

public class Article {
    private List<Section> sections;

    List<Image> getAllImages() {
        List<Image> images = new ArrayList<>();
        for (Section section : sections) {
            images.addAll(section.getImages());
        }

        return images;
    }
}
