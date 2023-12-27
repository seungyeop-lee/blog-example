package com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_error_delivery.result_type;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_error_delivery.stub.Result;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_error_delivery.stub.UI;

public class UiController {
    private final UI ui;

    public UiController(UI ui) {
        this.ui = ui;
    }

    void displaySquareRoot() {
        Result<Double, NegativeNumberError> squareRoot = getSquareRoot(ui.getInputNumber());
        if (squareRoot.hasError()) {
            ui.setError("Can't get square root of negative number: " + squareRoot.getError().getErroneousNumber());
        } else {
            ui.setOutput("Square root is: " + squareRoot.getValue());
        }
    }

    Result<Double, NegativeNumberError> getSquareRoot(Double value) {
        if (value < 0.0) {
            return Result.ofError(new NegativeNumberError(value));
        }

        return Result.ofValue(Math.sqrt(value));
    }
}
