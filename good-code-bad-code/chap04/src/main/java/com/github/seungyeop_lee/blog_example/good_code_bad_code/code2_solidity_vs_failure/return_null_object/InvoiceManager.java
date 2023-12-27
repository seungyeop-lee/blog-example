package com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_solidity_vs_failure.return_null_object;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_solidity_vs_failure.stub.Invoice;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_solidity_vs_failure.stub.InvoiceResult;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_solidity_vs_failure.stub.InvoiceStore;

import java.util.List;

public class InvoiceManager {
    private final InvoiceStore invoiceStore;

    public InvoiceManager(InvoiceStore invoiceStore) {
        this.invoiceStore = invoiceStore;
    }

    List<Invoice> getUnpaidInvoices(int customerId) {
        InvoiceResult result = invoiceStore.query(customerId);
        if (!result.success()) {
            return List.of();
        }

        return result.getInvoices()
                .stream()
                .filter(invoice -> !invoice.isPaid())
                .toList();
    }
}
