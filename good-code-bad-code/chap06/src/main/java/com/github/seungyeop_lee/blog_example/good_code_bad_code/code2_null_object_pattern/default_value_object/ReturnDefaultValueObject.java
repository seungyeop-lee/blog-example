package com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_null_object_pattern.default_value_object;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_null_object_pattern.default_value_object.stub.CoffeeMug;

import java.util.List;
import java.util.Random;

public class ReturnDefaultValueObject {
    private static class CoffeeMugInventory {
        private final List<CoffeeMug> mugs;

        private CoffeeMugInventory(List<CoffeeMug> mugs) {
            this.mugs = mugs;
        }

        CoffeeMug getRandomMug() {
            if (mugs.isEmpty()) {
                return new CoffeeMug(0.0, 0.0);
            }
            return mugs.get(new Random().nextInt(0, mugs.size()));
        }
    }
}
