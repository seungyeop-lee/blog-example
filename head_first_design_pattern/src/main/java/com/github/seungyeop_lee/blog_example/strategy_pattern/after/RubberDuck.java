package com.github.seungyeop_lee.blog_example.strategy_pattern.after;

import com.github.seungyeop_lee.blog_example.strategy_pattern.after.fly_behavior.FlyNoWay;
import com.github.seungyeop_lee.blog_example.strategy_pattern.after.quack_behavior.Squeak;

class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public String display() {
        return "고무오리 모습";
    }
}
