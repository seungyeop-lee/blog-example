package com.github.seungyeop_lee.blog_example.strategy_pattern.after;

class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new QuackBehavior.Quack();
        flyBehavior = new FlyBehavior.FlyWithWings();
    }

    @Override
    public String display() {
        return "청둥오리 모습";
    }
}
