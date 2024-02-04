package com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_assumptions.enforcing_assumptions;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_assumptions.stub.Section;

import java.util.List;
import java.util.Optional;

public class Before {
    public class Article {
        private List<Section> sections;

        Optional<Section> getImageSection() {
            //기사 내에 이미지를 포함하는 섹션은 최대 하나만 있다.
            return sections.stream()
                    .filter(Section::containsImages)
                    .findFirst();
        }
    }
}
