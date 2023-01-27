package com.github.seungyeop_lee.blog_example.strategy_pattern.after;

import com.github.seungyeop_lee.blog_example.strategy_pattern.common.DuckTest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class AfterDuckTest extends DuckTest {
    @Test
    public void afterDecoyDuckTest() {
        DecoyAfterDuck decoyDuck = new DecoyAfterDuck();
        decoyDuckTest(decoyDuck);
    }

    @Test
    public void afterMallardDuckTest() {
        MallardAfterDuck mallardDuck = new MallardAfterDuck();
        mallardDuckTest(mallardDuck);
    }

    @Test
    public void afterRedheadDuckTest() {
        RedheadAfterDuck redheadDuck = new RedheadAfterDuck();
        redheadDuckTest(redheadDuck);
    }

    @Test
    public void afterRubberDuckTest() {
        RubberAfterDuck rubberDuck = new RubberAfterDuck();
        rubberDuckTest(rubberDuck);
    }

    @Test
    public void afterChangeBehaviorTest() {
        RubberAfterDuck rubberDuck = new RubberAfterDuck();

        rubberDuck.setQuackBehavior(new QuackBehavior.Quack());
        rubberDuck.setFlyBehavior(new FlyBehavior.FlyWithWings());

        Assertions.assertThat(rubberDuck.quack()).isEqualTo(QuackResultConst.quack);
        Assertions.assertThat(rubberDuck.fly()).isEqualTo(FlyResultConst.flyWithWings);
        Assertions.assertThat(rubberDuck.display()).isEqualTo("고무오리 모습");
    }
}
