package com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_error_delivery.promise_or_futhre;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_error_delivery.stub.Result;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_error_delivery.stub.UI;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;

public class UiControllerExplicit {
    private final UI ui;

    public UiControllerExplicit(UI ui) {
        this.ui = ui;
    }

    void displaySquareRoot() {
        getSquareRoot(ui.getInputNumber())
                .thenAccept(result -> {
                    if (result.hasError()) {
                        ui.setError("An error occurred: " + result.getError().getErroneousNumber());
                    } else {
                        ui.setOutput("Square root is: " + result);
                    }
                });
    }

    CompletableFuture<Result<Double, NegativeNumberError>> getSquareRoot(Double value) {
        return CompletableFuture.supplyAsync(() -> {
            Timer.wait(Duration.ofSeconds(1));
            if (value < 0.0) {
                return Result.ofError(new NegativeNumberError(value));
            }

            return Result.ofValue(Math.sqrt(value));
        });
    }
}
