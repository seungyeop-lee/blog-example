package com.github.seungyeop_lee.blog_example.strategy_pattern.before;

import com.github.seungyeop_lee.blog_example.strategy_pattern.common.DuckTest;
import org.junit.jupiter.api.Test;

class BeforeDuckTest extends DuckTest {
    @Test
    public void beforeDecoyDuckTest() {
        DecoyBeforeDuck decoyDuck = new DecoyBeforeDuck();
        decoyDuckTest(decoyDuck);
    }

    @Test
    public void beforeMallardDuckTest() {
        MallardBeforeDuck mallardDuck = new MallardBeforeDuck();
        mallardDuckTest(mallardDuck);
    }

    @Test
    public void beforeRedheadDuckTest() {
        RedheadBeforeDuck redheadDuck = new RedheadBeforeDuck();
        redheadDuckTest(redheadDuck);
    }

    @Test
    public void beforeRubberDuckTest() {
        RubberBeforeDuck rubberDuck = new RubberBeforeDuck();
        rubberDuckTest(rubberDuck);
    }
}
