package com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_error_delivery.return_magic_value;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_error_delivery.stub.UI;

public class UiController {
    private final UI ui;

    public UiController(UI ui) {
        this.ui = ui;
    }

    void displaySquareRoot() {
        double squareRoot = getSquareRoot(ui.getInputNumber());
        if (squareRoot == -1.0) {
            ui.setError("Can't get square root of negative number");
        } else {
            ui.setOutput("Square root is: " + squareRoot);
        }
    }

    // 음숫값이 입력으로 제공되면 -1을 반환한다.
    double getSquareRoot(Double value) {
        if (value < 0.0) {
            return -1.0;
        }

        return Math.sqrt(value);
    }
}
