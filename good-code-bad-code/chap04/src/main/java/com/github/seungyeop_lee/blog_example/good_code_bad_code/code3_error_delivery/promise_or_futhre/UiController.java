package com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_error_delivery.promise_or_futhre;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_error_delivery.stub.UI;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;

public class UiController {
    private final UI ui;

    public UiController(UI ui) {
        this.ui = ui;
    }

    void displaySquareRoot() {
        getSquareRoot(ui.getInputNumber())
                .thenAccept(squareRoot -> ui.setOutput("Square root is: " + squareRoot))
                .exceptionally(e -> {
                    ui.setError("An error occurred: " + e.toString());
                    return null;
                });
    }

    CompletableFuture<Double> getSquareRoot(Double value) {
        return CompletableFuture.supplyAsync(() -> {
            Timer.wait(Duration.ofSeconds(1));
            if (value < 0.0) {
                throw new NegativeNumberError(value);
            }

            return Math.sqrt(value);
        });
    }
}
