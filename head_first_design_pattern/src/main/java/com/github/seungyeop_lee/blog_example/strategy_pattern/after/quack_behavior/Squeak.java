package com.github.seungyeop_lee.blog_example.strategy_pattern.after.quack_behavior;

public class Squeak implements QuackBehavior {
    @Override
    public String quack() {
        return "삑삑";
    }
}
