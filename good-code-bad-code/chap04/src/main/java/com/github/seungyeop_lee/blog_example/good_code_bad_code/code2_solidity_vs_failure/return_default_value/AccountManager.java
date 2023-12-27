package com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_solidity_vs_failure.return_default_value;

import com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_solidity_vs_failure.stub.AccountResult;
import com.github.seungyeop_lee.blog_example.good_code_bad_code.code2_solidity_vs_failure.stub.AccountStore;

public class AccountManager {
    private final AccountStore accountStore;

    public AccountManager(AccountStore accountStore) {
        this.accountStore = accountStore;
    }

    Double getAccountBalanceUsd(int customerId) {
        AccountResult result = accountStore.lookup(customerId);
        if (!result.success()) {
            return 0.0;
        }

        return result.getAccount().getBalanceUsd();
    }
}
