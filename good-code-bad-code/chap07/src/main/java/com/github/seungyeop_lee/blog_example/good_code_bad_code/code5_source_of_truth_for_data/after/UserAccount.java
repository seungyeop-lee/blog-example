package com.github.seungyeop_lee.blog_example.good_code_bad_code.code5_source_of_truth_for_data.after;

class UserAccount {
    private final Double credit;
    private final Double debit;

    UserAccount(Double credit, Double debit) {
        this.credit = credit;
        this.debit = debit;
    }

    Double getCredit() {
        return credit;
    }

    Double getDebit() {
        return debit;
    }

    Double getBalance() {
        return credit - debit;
    }
}
