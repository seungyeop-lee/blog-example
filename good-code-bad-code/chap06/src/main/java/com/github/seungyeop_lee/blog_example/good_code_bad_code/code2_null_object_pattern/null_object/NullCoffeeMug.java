package com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_null_object_pattern.null_object;

public class NullCoffeeMug implements CoffeeMug {
    @Override
    public Double getDiameter() {
        return 0.0;
    }

    @Override
    public Double getHeight() {
        return 0.0;
    }

    @Override
    public void reportMugBroken() {
    }
}
