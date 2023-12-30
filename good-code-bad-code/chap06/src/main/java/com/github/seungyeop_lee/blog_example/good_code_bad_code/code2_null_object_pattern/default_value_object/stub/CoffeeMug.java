package com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_null_object_pattern.default_value_object.stub;

public class CoffeeMug {
    private final Double diameter;
    private final Double height;

    public CoffeeMug(Double diameter, Double height) {
        this.diameter = diameter;
        this.height = height;
    }

    public Double getDiameter() {
        return diameter;
    }

    public Double getHeight() {
        return height;
    }
}
