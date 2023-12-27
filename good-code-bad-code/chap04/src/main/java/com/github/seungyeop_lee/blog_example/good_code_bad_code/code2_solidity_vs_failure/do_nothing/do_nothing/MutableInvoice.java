package com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_solidity_vs_failure.do_nothing.do_nothing;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_solidity_vs_failure.stub.Currency;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_solidity_vs_failure.stub.InvoiceItem;

import java.util.List;

public class MutableInvoice {

    private final List<InvoiceItem> items;

    public MutableInvoice(List<InvoiceItem> items) {
        this.items = items;
    }

    void addItem(InvoiceItem item) {
        if (item.getPrice().getCurrency() != this.getCurrency()) {
            return;
        }

        this.items.add(item);
    }

    private Currency getCurrency() {
        return null;
    }
}
