package com.github.seungyeop_lee.blog_example.good_code_bad_code.code5_source_of_truth_for_data.after_with_cache;

import com.google.common.collect.ImmutableList;

class UserAccount {
    private final ImmutableList<Transaction> transactions;

    private Double cachedCredit;
    private Double cachedDebit;

    UserAccount(ImmutableList<Transaction> transactions) {
        this.transactions = transactions;
    }

    Double getCredit() {
        if (cachedCredit == null) {
            cachedCredit = transactions.stream()
                    .mapToDouble(Transaction::getCredit)
                    .sum();
        }
        return cachedCredit;
    }

    Double getDebit() {
        if (cachedDebit == null) {
            cachedDebit = transactions.stream()
                    .mapToDouble(Transaction::getDebit)
                    .sum();
        }
        return cachedDebit;
    }

    Double getBalance() {
        return getCredit() - getDebit();
    }
}
