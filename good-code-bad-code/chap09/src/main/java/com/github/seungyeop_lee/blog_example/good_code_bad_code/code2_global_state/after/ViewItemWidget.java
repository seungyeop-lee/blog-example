package com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_global_state.after;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_global_state.stub.Item;

class ViewItemWidget {

    private final Item item;
    private final ShoppingBasket basket;

    public ViewItemWidget(Item item, ShoppingBasket basket) {
        this.item = item;
        this.basket = basket;
    }

    void addItemToBasket() {
        basket.addItem(item);
    }
}
