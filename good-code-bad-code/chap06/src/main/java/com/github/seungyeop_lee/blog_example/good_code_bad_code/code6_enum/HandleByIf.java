package com.github.seungyeop_lee.blog_example.good_code_bad_code.code6_enum;

public class HandleByIf {
    boolean isOutcomeSafe(PredictedOutcome prediction) {
        if (prediction == PredictedOutcome.COMPANY_WILL_GO_BUST) {
            return false;
        }
        return true; // PredictedOutcome.WORLD_WILL_END일 경우 참을 반환한다.
    }
}
