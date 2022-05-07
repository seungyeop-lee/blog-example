package com.github.seungyeop_lee.blog_example.strategy_pattern.after;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class DuckTest {
    private static class QuackResultConst {
        public static String muteQuack = "";
        public static String quack = "꽥꽥";
        public static String squeak = "삑삑";
    }

    private static class FlyResultConst {
        public static String flyWithWings = "파닥파닥";
        public static String flyNoWay = "";
    }

    @Test
    public void decoyDuckTest() {
        DecoyDuck decoyDuck = new DecoyDuck();

        Assertions.assertThat(decoyDuck.quack()).isEqualTo(DuckTest.QuackResultConst.muteQuack);
        Assertions.assertThat(decoyDuck.fly()).isEqualTo(DuckTest.FlyResultConst.flyNoWay);
        Assertions.assertThat(decoyDuck.display()).isEqualTo("가짜 오리 모습");
    }

    @Test
    public void mallardDuckTest() {
        MallardDuck mallardDuck = new MallardDuck();

        Assertions.assertThat(mallardDuck.quack()).isEqualTo(DuckTest.QuackResultConst.quack);
        Assertions.assertThat(mallardDuck.fly()).isEqualTo(DuckTest.FlyResultConst.flyWithWings);
        Assertions.assertThat(mallardDuck.display()).isEqualTo("청둥오리 모습");
    }

    @Test
    public void redheadDuckTest() {
        RedheadDuck redheadDuck = new RedheadDuck();

        Assertions.assertThat(redheadDuck.quack()).isEqualTo(DuckTest.QuackResultConst.quack);
        Assertions.assertThat(redheadDuck.fly()).isEqualTo(DuckTest.FlyResultConst.flyWithWings);
        Assertions.assertThat(redheadDuck.display()).isEqualTo("붉은머리오리 모습");
    }

    @Test
    public void rubberDuckTest() {
        RubberDuck rubberDuck = new RubberDuck();

        Assertions.assertThat(rubberDuck.quack()).isEqualTo(DuckTest.QuackResultConst.squeak);
        Assertions.assertThat(rubberDuck.fly()).isEqualTo(DuckTest.FlyResultConst.flyNoWay);
        Assertions.assertThat(rubberDuck.display()).isEqualTo("고무오리 모습");
    }

    @Test
    public void changeBehaviorTest() {
        RubberDuck rubberDuck = new RubberDuck();

        rubberDuck.setQuackBehavior(new QuackBehavior.Quack());
        rubberDuck.setFlyBehavior(new FlyBehavior.FlyWithWings());

        Assertions.assertThat(rubberDuck.quack()).isEqualTo(QuackResultConst.quack);
        Assertions.assertThat(rubberDuck.fly()).isEqualTo(FlyResultConst.flyWithWings);
        Assertions.assertThat(rubberDuck.display()).isEqualTo("고무오리 모습");
    }
}
