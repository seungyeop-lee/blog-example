package com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_error_delivery.return_null;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_error_delivery.stub.UI;

import java.util.Optional;

public class UiController {
    private final UI ui;

    public UiController(UI ui) {
        this.ui = ui;
    }

    void displaySquareRoot() {
        Optional<Double> squareRoot = getSquareRoot(ui.getInputNumber());
        if (squareRoot.isEmpty()) {
            ui.setError("Can't get square root of negative number");
        } else {
            ui.setOutput("Square root is: " + squareRoot.get());
        }
    }

    // 제공되는 값이 음수이면 빈 Optional을 반환한다.
    Optional<Double> getSquareRoot(Double value) {
        if (value < 0.0) {
            return Optional.empty();
        }

        return Optional.of(Math.sqrt(value));
    }
}
