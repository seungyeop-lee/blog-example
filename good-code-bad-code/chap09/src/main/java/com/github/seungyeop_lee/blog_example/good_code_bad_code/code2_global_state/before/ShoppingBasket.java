package com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_global_state.before;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_global_state.stub.Item;

import java.util.ArrayList;
import java.util.List;

class ShoppingBasket {

    private static final List<Item> items = new ArrayList<>();

    public static void addItem(Item item) {
        items.add(item);
    }

    public static List<Item> getItems() {
        return List.copyOf(items);
    }
}

