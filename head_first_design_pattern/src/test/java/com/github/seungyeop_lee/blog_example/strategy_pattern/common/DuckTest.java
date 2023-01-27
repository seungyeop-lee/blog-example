package com.github.seungyeop_lee.blog_example.strategy_pattern.common;

import org.assertj.core.api.Assertions;

public class DuckTest {
    protected static class QuackResultConst {
        public static String muteQuack = "";
        public static String quack = "꽥꽥";
        public static String squeak = "삑삑";
    }

    protected static class FlyResultConst {
        public static String flyWithWings = "파닥파닥";
        public static String flyNoWay = "";
    }

    protected void decoyDuckTest(Duck duck) {
        duckTest(duck, QuackResultConst.muteQuack, FlyResultConst.flyNoWay, "가짜 오리 모습");
    }

    protected void mallardDuckTest(Duck duck) {
        duckTest(duck, QuackResultConst.quack, FlyResultConst.flyWithWings, "청둥오리 모습");
    }

    protected void redheadDuckTest(Duck duck) {
        duckTest(duck, QuackResultConst.quack, FlyResultConst.flyWithWings, "붉은머리오리 모습");
    }

    protected void rubberDuckTest(Duck duck) {
        duckTest(duck, QuackResultConst.squeak, FlyResultConst.flyNoWay, "고무오리 모습");
    }

    private void duckTest(Duck duck, String quackResult, String flyResult, String displayResult) {
        Assertions.assertThat(duck.quack()).isEqualTo(quackResult);
        Assertions.assertThat(duck.fly()).isEqualTo(flyResult);
        Assertions.assertThat(duck.display()).isEqualTo(displayResult);
    }
}
