package com.jun.structure.bridge;

/**
 * @author：cj
 * @date：2020-7-11 16:35
 * @desc：
 */
public class DepositAccount implements Account {
    //初始化对象
    public Account openAccount() {
        System.out.println("打开定期帐号");
        return new DepositAccount();
    }

    public void showAccountType() {
        System.out.println("这是定期账号");
    }
}
