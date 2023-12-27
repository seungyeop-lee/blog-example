package com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_error_delivery.unchecked_exception;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_error_delivery.stub.UI;

public class UiController {
    private final UI ui;

    public UiController(UI ui) {
        this.ui = ui;
    }

    private class ExceptionCatch {
        void displaySquareRoot() {
            Double value = ui.getInputNumber();

            try {
                ui.setOutput("Square root is: " + getSquareRoot(value));
            } catch (NegativeNumberException e) {
                ui.setError("Can't get square root of negative number: " + e.getErroneousNumber());
            }
        }
    }

    private class ExceptionThrow {
        void displaySquareRoot() {
            Double value = ui.getInputNumber();
            ui.setOutput("Square root is: " + getSquareRoot(value));
        }
    }

    /**
     * @throws NegativeNumberException 값이 음수일 경우
     */
    Double getSquareRoot(Double value) throws NegativeNumberException {
        if (value < 0.0) {
            throw new NegativeNumberException(value);
        }

        return Math.sqrt(value);
    }
}
