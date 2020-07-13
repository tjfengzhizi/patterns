package com.jun.structural.bridge;

/**
 * @author：cj
 * @date：2020-7-11 16:37
 * @desc：
 */
public abstract class Bank {
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    protected abstract Account openAccount();
}
