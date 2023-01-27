package com.github.seungyeop_lee.blog_example.strategy_pattern.before;

public class RubberBeforeDuck extends BeforeDuck {
    @Override
    public String quack() {
        return "삑삑";
    }

    @Override
    public String fly() {
        return "";
    }

    @Override
    public String display() {
        return "고무오리 모습";
    }
}
