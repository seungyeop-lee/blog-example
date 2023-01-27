package com.github.seungyeop_lee.blog_example.strategy_pattern.after;

public class MallardAfterDuck extends AfterDuck {
    public MallardAfterDuck() {
        quackBehavior = new QuackBehavior.Quack();
        flyBehavior = new FlyBehavior.FlyWithWings();
    }

    @Override
    public String display() {
        return "청둥오리 모습";
    }
}
