package com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_assumptions.enforcing_assumptions;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code1_assumptions.stub.Section;

import java.util.Optional;

public class ArticleRenderer {

    private TemplateData templateData;

    void render(Before.Article article) {
        Optional<Section> imageSectionOption = article.getImageSection();
        imageSectionOption.ifPresent(imageSection -> templateData.setImageSection(imageSection));
    }
}
