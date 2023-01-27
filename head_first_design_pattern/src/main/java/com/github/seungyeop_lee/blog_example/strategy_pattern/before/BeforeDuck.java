package com.github.seungyeop_lee.blog_example.strategy_pattern.before;

import com.github.seungyeop_lee.blog_example.strategy_pattern.common.Duck;

public abstract class BeforeDuck implements Duck {
    public String quack() {
        return "꽥꽥";
    }

    public String fly() {
        return "파닥파닥";
    }

    public abstract String display();
}
