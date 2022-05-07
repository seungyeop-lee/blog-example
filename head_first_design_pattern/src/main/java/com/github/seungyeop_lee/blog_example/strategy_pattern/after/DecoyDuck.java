package com.github.seungyeop_lee.blog_example.strategy_pattern.after;

import com.github.seungyeop_lee.blog_example.strategy_pattern.after.fly_behavior.FlyNoWay;
import com.github.seungyeop_lee.blog_example.strategy_pattern.after.quack_behavior.MuteQuack;

class DecoyDuck extends Duck {
    public DecoyDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public String display() {
        return "가짜 오리 모습";
    }
}
