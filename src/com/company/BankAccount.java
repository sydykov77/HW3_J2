package com.company;

public class BankAccount {
    double amount = 0;


    public double getAmount() {
        return amount;
    }

    public double deposit(double sum) {
        amount = sum + amount;
        System.out.println(getAmount());
        return amount;
    }

    public double withdraw(int sum)
            throws LimitException {
        if (sum > amount) {
            throw new LimitException("Сумма снятия превышает остаток на счету!", amount);
        }
        amount = amount - sum;
        System.out.println(amount);
        return amount;
    }


}
