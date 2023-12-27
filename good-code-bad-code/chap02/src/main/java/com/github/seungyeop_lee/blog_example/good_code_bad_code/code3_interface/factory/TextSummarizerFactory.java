package com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_interface.factory;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_interface.factory.stub.ParagraphFinder;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_interface.factory.stub.TextSummarizer;

public class TextSummarizerFactory {
    TextSummarizer createWordBasedSummarizer() {
        return new TextSummarizer(
                new ParagraphFinder(),
                new WordBasedScorer()
        );
    }

    TextSummarizer createModelBasedSummarizer() {
        return new TextSummarizer(
                new ParagraphFinder(),
                ModelBasedScorer.create()
        );
    }
}
