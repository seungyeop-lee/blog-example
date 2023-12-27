package com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_solidity_vs_failure.do_nothing.exception_log;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_solidity_vs_failure.stub.*;

public class InvoiceSender {

    private final EmailService emailService;
    private final Logger logger;

    public InvoiceSender(EmailService emailService, Logger logger) {
        this.emailService = emailService;
        this.logger = logger;
    }

    void emailInvoice(String emailAddress, Invoice invoice) {
        try {
            emailService.sendPlainText(
                    emailAddress,
                    InvoiceFormat.plainText(invoice)
            );
        } catch (EmailException e) {
            logger.logError(e);
        }
    }
}
