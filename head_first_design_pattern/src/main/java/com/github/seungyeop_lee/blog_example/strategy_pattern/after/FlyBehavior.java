package com.github.seungyeop_lee.blog_example.strategy_pattern.after;

interface FlyBehavior {
    String fly();

    class FlyNoWay implements FlyBehavior {
        @Override
        public String fly() {
            return "";
        }
    }

    class FlyWithWings implements FlyBehavior {
        @Override
        public String fly() {
            return "파닥파닥";
        }
    }
}
