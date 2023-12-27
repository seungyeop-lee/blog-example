package com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_interface.factory;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_interface.factory.stub.TextPredictionModel;

class ModelBasedScorer implements TextImportanceScorer {

    private static final String MODEL_FILE = "";
    private static final Double MODEL_THRESHOLD = 1.0;

    private final TextPredictionModel model;

    public ModelBasedScorer(TextPredictionModel model) {
        this.model = model;
    }

    static ModelBasedScorer create() {
        return new ModelBasedScorer(TextPredictionModel.load(MODEL_FILE));
    }

    @Override
    public Boolean isImportant(String text) {
        return model.predict(text) >= MODEL_THRESHOLD;
    }
}
