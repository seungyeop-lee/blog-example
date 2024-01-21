package com.github.seungyeop_lee.blog_example.good_code_bad_code.code7_dont_impl_info_in_exception.bad;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code7_dont_impl_info_in_exception.common_stub.Model;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code7_dont_impl_info_in_exception.common_stub.PredictionModelException;

class ModelBasedScorer implements TextImportanceScorer {

    private final Model model;
    private final Integer MODEL_THRESHOLD = 0;

    public ModelBasedScorer(Model model) {
        this.model = model;
    }

    /**
     * @throws PredictionModelException 예측 모델을 실행하는 동안
     *                                  에러가 발생하는 경우
     */
    @Override
    public boolean isImportant(String text) {
        return model.predict(text) >= MODEL_THRESHOLD;
    }
}
