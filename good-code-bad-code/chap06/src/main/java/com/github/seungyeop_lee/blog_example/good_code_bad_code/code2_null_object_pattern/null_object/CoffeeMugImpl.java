package com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_null_object_pattern.null_object;

public class CoffeeMugImpl implements CoffeeMug {
    private final Double diameter;
    private final Double height;

    public CoffeeMugImpl(Double diameter, Double height) {
        this.diameter = diameter;
        this.height = height;
    }

    @Override
    public Double getDiameter() {
        return diameter;
    }

    @Override
    public Double getHeight() {
        return height;
    }

    @Override
    public void reportMugBroken() {
        System.out.println("Broken Report");
    }
}
