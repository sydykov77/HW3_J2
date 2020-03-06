package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount userBank = new BankAccount();
        userBank.deposit(10000.0);
        while (true) {
            try {
                userBank.withdraw(6000);
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                try {
                    userBank.withdraw(e.getRemainingAmount());
                } catch (LimitException e1) {
                    e1.printStackTrace();
                }
                break;
            }
        }
    }
}
