package com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_global_state.before;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_global_state.stub.Item;

import java.util.List;

class ViewBasketWidget {

    void displayItems() {
        List<Item> items = ShoppingBasket.getItems();
    }
}
