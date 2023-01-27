package com.github.seungyeop_lee.blog_example.strategy_pattern.after;

public class RubberAfterDuck extends AfterDuck {
    public RubberAfterDuck() {
        quackBehavior = new QuackBehavior.Squeak();
        flyBehavior = new FlyBehavior.FlyNoWay();
    }

    @Override
    public String display() {
        return "고무오리 모습";
    }
}
