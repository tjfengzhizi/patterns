package com.jun.structural.bridge;

/**
 * @author：cj
 * @date：2020-7-11 16:37
 * @desc：
 */
public class SavingAccount implements Account {
    public Account openAccount() {
        System.out.println("打开活期帐号");
        return new SavingAccount();
    }

    public void showAccountType() {
        System.out.println("这是活期账号");
    }
}
