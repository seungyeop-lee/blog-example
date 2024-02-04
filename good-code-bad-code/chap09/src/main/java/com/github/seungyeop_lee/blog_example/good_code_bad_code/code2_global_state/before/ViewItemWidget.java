package com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_global_state.before;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_global_state.stub.Item;

class ViewItemWidget {

    private final Item item;

    public ViewItemWidget(Item item) {
        this.item = item;
    }

    void addItemToBasket() {
        ShoppingBasket.addItem(item);
    }
}
