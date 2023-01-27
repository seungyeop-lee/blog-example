package com.github.seungyeop_lee.blog_example.strategy_pattern.after;

public class DecoyAfterDuck extends AfterDuck {
    public DecoyAfterDuck() {
        quackBehavior = new QuackBehavior.MuteQuack();
        flyBehavior = new FlyBehavior.FlyNoWay();
    }

    @Override
    public String display() {
        return "가짜 오리 모습";
    }
}
