package com.jun.structure.bridge;

/**
 * @author：cj
 * @date：2020-7-11 16:41
 * @desc：
 */
public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    protected Account openAccount() {
        System.out.println("打开工商银行帐号");
        account.openAccount();
        return account;
    }
}
