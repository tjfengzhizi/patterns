package com.jun.structural.bridge;

/**
 * @author：cj
 * @date：2020-7-11 16:42
 * @desc：桥接模式
 */
public class Test {
    public static void main(String[] args) {
        Bank bank = new ABCBank(new DepositAccount());
        Account account = bank.openAccount();
        account.showAccountType();
        System.out.println("------------------------");

        Bank bank1 = new ICBCBank(new SavingAccount());
        Account account1 = bank1.openAccount();
        account1.showAccountType();
        System.out.println("------------------------");

        Bank bank2 = new ABCBank(new SavingAccount());
        Account account2 = bank2.openAccount();
        account2.showAccountType();
    }
}
