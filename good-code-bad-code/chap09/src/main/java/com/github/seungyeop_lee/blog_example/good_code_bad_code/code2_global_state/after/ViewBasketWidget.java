package com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_global_state.after;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_global_state.stub.Item;

import java.util.List;

class ViewBasketWidget {

    private final ShoppingBasket basket;

    public ViewBasketWidget(ShoppingBasket basket) {
        this.basket = basket;
    }

    void displayItems() {
        List<Item> items = basket.getItems();
    }
}
