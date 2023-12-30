package com.github.seungyeop_lee.blog_example.good_code_bad_code.code4_input_parameter.stub;

import java.util.Map;
import java.util.Set;

public interface OrderBatch {
    Map<User, Invoice> getUserInvoices();

    Set<User> getFreeTrialUsers();
}
