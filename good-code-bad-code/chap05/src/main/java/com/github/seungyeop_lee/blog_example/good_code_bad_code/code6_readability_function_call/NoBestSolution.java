package com.github.seungyeop_lee.blog_example.good_code_bad_code.code6_readability_function_call;

public class NoBestSolution {
    private final class Client {
        public static void main(String[] args) {
            BoundingBox box = new BoundingBox(
                    /* top= */ 10,
                    /* right= */ 50,
                    /* bottom= */ 20,
                    /* left= */ 5
            );
        }
    }

    private static class BoundingBox {
        BoundingBox(Integer top, Integer right, Integer bottom, Integer left) {

        }
    }
}
