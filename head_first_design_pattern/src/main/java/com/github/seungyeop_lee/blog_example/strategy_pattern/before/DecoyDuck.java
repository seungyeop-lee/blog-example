package com.github.seungyeop_lee.blog_example.strategy_pattern.before;

class DecoyDuck extends Duck {
    @Override
    public String quack() {
        return "";
    }

    @Override
    public String fly() {
        return "";
    }

    @Override
    public String display() {
        return "가짜 오리 모습";
    }
}
