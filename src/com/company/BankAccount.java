package com.company;

public class BankAccount {
    double amount;


    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount = sum + amount;
        System.out.println(getAmount());
    }

    public void withdraw(int sum)
            throws LimitException {
        if (sum > amount) {
            throw new LimitException("Сумма снятия превышает остаток на счету!", amount);
        } else {
            amount = amount - sum;
            System.out.println(amount);
        }
        if (sum > amount) {
            System.out.println(amount = amount - amount);
        }


    }
}
