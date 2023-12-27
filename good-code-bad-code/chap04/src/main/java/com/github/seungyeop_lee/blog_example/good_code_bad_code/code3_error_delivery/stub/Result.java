package com.github.seungyeop_lee.blog_example.good_code_bad_code.code3_error_delivery.stub;

import java.util.Optional;

public class Result<V, E> {

    private final Optional<V> value;
    private final Optional<E> error;

    public Result(Optional<V> value, Optional<E> error) {
        this.value = value;
        this.error = error;
    }

    public static <V, E> Result<V, E> ofValue(V value) {
        return new Result<>(Optional.of(value), Optional.empty());
    }

    public static <V, E> Result<V, E> ofError(E error) {
        return new Result<>(Optional.empty(), Optional.of(error));
    }

    public Boolean hasError() {
        return error.isPresent();
    }

    public V getValue() {
        return value.orElse(null);
    }

    public E getError() {
        return error.orElse(null);
    }
}
