package com.github.seungyeop_lee.blog_example.strategy_pattern.after;

class RedheadDuck extends Duck {
    public RedheadDuck() {
        quackBehavior = new QuackBehavior.Quack();
        flyBehavior = new FlyBehavior.FlyWithWings();
    }

    @Override
    public String display() {
        return "붉은머리오리 모습";
    }
}
