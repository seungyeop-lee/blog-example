package com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_error_delivery.unchecked_exception;

class NegativeNumberException extends RuntimeException {
    private final Double erroneousNumber;

    public NegativeNumberException(Double erroneousNumber) {
        this.erroneousNumber = erroneousNumber;
    }

    Double getErroneousNumber() {
        return erroneousNumber;
    }
}
