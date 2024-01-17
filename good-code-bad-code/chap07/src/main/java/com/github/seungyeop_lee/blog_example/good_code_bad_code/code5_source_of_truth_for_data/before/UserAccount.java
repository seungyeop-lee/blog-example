package com.github.seungyeop_lee.blog_example.good_code_bad_code.code5_source_of_truth_for_data.before;

class UserAccount {
    private final Double credit;
    private final Double debit;
    private final Double balance;

    UserAccount(Double credit, Double debit, Double balance) {
        this.credit = credit;
        this.debit = debit;
        this.balance = balance;
    }

    Double getCredit() {
        return credit;
    }

    Double getDebit() {
        return debit;
    }

    Double getBalance() {
        return balance;
    }
}
