package com.github.seungyeop_lee.blog_example.strategy_pattern.after;

abstract class Duck {
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
