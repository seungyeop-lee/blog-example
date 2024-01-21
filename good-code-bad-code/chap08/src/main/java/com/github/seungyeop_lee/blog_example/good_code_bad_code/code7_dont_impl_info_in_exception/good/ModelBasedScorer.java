package com.github.seungyeop_lee.blog_example.good_code_bad_code.code7_dont_impl_info_in_exception.good;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code7_dont_impl_info_in_exception.common_stub.Model;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code7_dont_impl_info_in_exception.common_stub.PredictionModelException;

class ModelBasedScorer implements TextImportanceScorer {

    private final Model model;
    private final Integer MODEL_THRESHOLD = 0;

    public ModelBasedScorer(Model model) {
        this.model = model;
    }

    @Override
    public boolean isImportant(String text) throws TextImportanceScorerException {
        try {
            return model.predict(text) >= MODEL_THRESHOLD;
        } catch (PredictionModelException e) {
            throw new TextImportanceScorerException(e);
        }
    }
}
