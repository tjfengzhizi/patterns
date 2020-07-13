package com.jun.structural.bridge;

/**
 * @author：cj
 * @date：2020-7-11 16:39
 * @desc：
 */
public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    protected Account openAccount() {
        System.out.println("打开农业银行账户");
        account.openAccount();
        return account;
    }
}
