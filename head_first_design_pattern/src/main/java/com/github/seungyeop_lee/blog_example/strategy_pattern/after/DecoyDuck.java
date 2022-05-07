package com.github.seungyeop_lee.blog_example.strategy_pattern.after;

class DecoyDuck extends Duck {
    public DecoyDuck() {
        quackBehavior = new QuackBehavior.MuteQuack();
        flyBehavior = new FlyBehavior.FlyNoWay();
    }

    @Override
    public String display() {
        return "가짜 오리 모습";
    }
}
