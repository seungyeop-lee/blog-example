package com.github.seungyeop_lee.blog_example.good_code_bad_code.code5_source_of_truth_for_data.before;

public class Use {
    public static void main(String[] args) {
        Double credit = 100.0;
        Double debit = 50.0;
        UserAccount userAccount = new UserAccount(credit, debit, debit - credit); //잘못된 balance 계산
    }
}
