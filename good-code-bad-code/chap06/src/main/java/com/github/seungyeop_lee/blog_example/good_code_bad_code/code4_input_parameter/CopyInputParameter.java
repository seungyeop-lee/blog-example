package com.github.seungyeop_lee.blog_example.good_code_bad_code.code4_input_parameter;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code4_input_parameter.stub.Invoice;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code4_input_parameter.stub.OrderBatch;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code4_input_parameter.stub.User;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CopyInputParameter {
    List<Invoice> getBillableInvoices(
            Map<User, Invoice> userInvoices,
            Set<User> userWithFreeTrial
    ) {
        return userInvoices.entrySet()
                .stream()
                .filter(entry -> !userWithFreeTrial.contains(entry.getKey()))
                .map(Map.Entry::getValue)
                .toList();
    }

    void processOrders(OrderBatch orderBatch) {
        Map<User, Invoice> userInvoices = orderBatch.getUserInvoices();
        Set<User> userWithFreeTrial = orderBatch.getFreeTrialUsers();

        sendInvoices(getBillableInvoices(userInvoices, userWithFreeTrial)); // 무료 평가판 유저가 userInvoices에서 삭제 됨
        enableOrderedServices(userInvoices); // 무료 평가판 유저가 포함되어 있지 않음
    }

    private void sendInvoices(List<Invoice> billableInvoices) {
    }

    private void enableOrderedServices(Map<User, Invoice> userInvoices) {
    }
}
