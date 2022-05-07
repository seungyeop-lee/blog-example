package com.github.seungyeop_lee.blog_example.strategy_pattern.after;

import com.github.seungyeop_lee.blog_example.strategy_pattern.after.fly_behavior.FlyWithWings;
import com.github.seungyeop_lee.blog_example.strategy_pattern.after.quack_behavior.Quack;

class RedheadDuck extends Duck {
    public RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public String display() {
        return "붉은머리오리 모습";
    }
}
