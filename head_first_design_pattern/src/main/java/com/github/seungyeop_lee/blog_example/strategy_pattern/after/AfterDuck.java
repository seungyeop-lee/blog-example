package com.github.seungyeop_lee.blog_example.strategy_pattern.after;

import com.github.seungyeop_lee.blog_example.strategy_pattern.common.Duck;

public abstract class AfterDuck implements Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public String quack() {
        return quackBehavior.quack();
    }

    public String fly() {
        return flyBehavior.fly();
    }

    public abstract String display();

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
