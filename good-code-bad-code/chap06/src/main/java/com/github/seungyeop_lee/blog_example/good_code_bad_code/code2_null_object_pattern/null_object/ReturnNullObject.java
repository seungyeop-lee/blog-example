package com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_null_object_pattern.null_object;

import java.util.List;
import java.util.Random;

public class ReturnNullObject {
    private static class CoffeeMugInventory {
        private final List<CoffeeMug> mugs;

        private CoffeeMugInventory(List<CoffeeMug> mugs) {
            this.mugs = mugs;
        }

        CoffeeMug getRandomMug() {
            if (mugs.isEmpty()) {
                return new NullCoffeeMug();
            }
            return mugs.get(new Random().nextInt(0, mugs.size()));
        }
    }
}
