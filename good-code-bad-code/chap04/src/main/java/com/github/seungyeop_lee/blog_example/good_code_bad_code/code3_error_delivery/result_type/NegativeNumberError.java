package com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_error_delivery.result_type;

class NegativeNumberError extends Error {
    private final Double erroneousNumber;

    public NegativeNumberError(Double erroneousNumber) {
        this.erroneousNumber = erroneousNumber;
    }

    public Double getErroneousNumber() {
        return erroneousNumber;
    }
}
