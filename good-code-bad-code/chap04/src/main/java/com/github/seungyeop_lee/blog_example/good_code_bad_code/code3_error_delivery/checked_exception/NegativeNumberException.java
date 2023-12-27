package com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_error_delivery.checked_exception;

class NegativeNumberException extends Exception {
    private final Double erroneousNumber;

    public NegativeNumberException(Double erroneousNumber) {
        this.erroneousNumber = erroneousNumber;
    }

    Double getErroneousNumber() {
        return erroneousNumber;
    }
}
