package com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_global_state.after;

public class Main {
    public static void main(String[] args) {
        ShoppingBasket normalBasket = new ShoppingBasket();
        ViewBasketWidget normalBasketWidget = new ViewBasketWidget(normalBasket);

        ShoppingBasket freshBasket = new ShoppingBasket();
        ViewBasketWidget freshBasketWidget = new ViewBasketWidget(freshBasket);
    }
}
