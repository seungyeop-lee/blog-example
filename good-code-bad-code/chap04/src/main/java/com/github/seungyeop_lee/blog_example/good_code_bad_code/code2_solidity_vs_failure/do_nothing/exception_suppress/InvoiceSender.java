package com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_solidity_vs_failure.do_nothing.exception_suppress;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_solidity_vs_failure.stub.EmailException;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_solidity_vs_failure.stub.EmailService;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_solidity_vs_failure.stub.Invoice;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_solidity_vs_failure.stub.InvoiceFormat;

public class InvoiceSender {

    private final EmailService emailService;

    public InvoiceSender(EmailService emailService) {
        this.emailService = emailService;
    }

    void emailInvoice(String emailAddress, Invoice invoice) {
        try {
            emailService.sendPlainText(
                    emailAddress,
                    InvoiceFormat.plainText(invoice)
            );
        } catch (EmailException e) {
        }
    }

}
