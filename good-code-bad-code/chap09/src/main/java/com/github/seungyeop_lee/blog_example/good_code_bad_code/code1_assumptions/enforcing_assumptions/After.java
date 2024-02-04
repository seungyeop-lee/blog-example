package com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_assumptions.enforcing_assumptions;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_assumptions.stub.Section;

import java.util.List;
import java.util.Optional;

public class After {
    public static class Article {
        private List<Section> sections;

        Optional<Section> getOnlyImageSection() {
            List<Section> imageSections = sections.stream().filter(Section::containsImages).toList();

            if (imageSections.size() <= 1) {
                throw new RuntimeException("기사가 여러 개의 이미지 섹션을 갖는다");
            }

            return Optional.of(imageSections.get(0));
        }
    }
}
