package com.github.seungyeop_lee.blog_example.strategy_pattern.after;

public class RedheadAfterDuck extends AfterDuck {
    public RedheadAfterDuck() {
        quackBehavior = new QuackBehavior.Quack();
        flyBehavior = new FlyBehavior.FlyWithWings();
    }

    @Override
    public String display() {
        return "붉은머리오리 모습";
    }
}
