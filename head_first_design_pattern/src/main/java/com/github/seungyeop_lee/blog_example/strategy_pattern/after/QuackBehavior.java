package com.github.seungyeop_lee.blog_example.strategy_pattern.after;

public interface QuackBehavior {
    String quack();

    class MuteQuack implements QuackBehavior {
        @Override
        public String quack() {
            return "";
        }
    }

    class Quack implements QuackBehavior {
        @Override
        public String quack() {
            return "꽥꽥";
        }
    }

    class Squeak implements QuackBehavior {
        @Override
        public String quack() {
            return "삑삑";
        }
    }
}
