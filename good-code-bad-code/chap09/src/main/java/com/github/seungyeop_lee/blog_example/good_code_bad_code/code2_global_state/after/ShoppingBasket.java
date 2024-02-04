package com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_global_state.after;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_global_state.stub.Item;

import java.util.ArrayList;
import java.util.List;

class ShoppingBasket {

    private final List<Item> items = new ArrayList<>();

    void addItem(Item item) {
        items.add(item);
    }

    List<Item> getItems() {
        return List.copyOf(items);
    }
}
