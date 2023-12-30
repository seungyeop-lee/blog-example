package com.github.seungyeop_lee.blog_example.good_code_bad_code.code6_enum;

public class HandleBySwitch {
    boolean isOutcomeSafe(PredictedOutcome prediction) {
        return switch (prediction) {
            case COMPANY_WILL_GO_BUST, WORLD_WILL_END -> false;
            case COMPANY_WILL_MAKE_A_PROFIT -> true;
            case null, default -> throw new IllegalArgumentException("Unhandled prediction: " + prediction);
        };
    }
}
