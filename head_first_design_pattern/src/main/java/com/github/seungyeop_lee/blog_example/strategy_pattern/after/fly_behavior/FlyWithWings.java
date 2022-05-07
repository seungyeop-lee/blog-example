package com.github.seungyeop_lee.blog_example.strategy_pattern.after.fly_behavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public String fly() {
        return "파닥파닥";
    }
}
