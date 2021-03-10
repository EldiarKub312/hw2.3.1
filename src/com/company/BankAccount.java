package com.company;

class BankAccount extends Exception {

    private double amount;

    public void deposite(double sum) {
        amount += sum;
    }

    public double getAmount() {
        return amount;
    }

    public double withDraw(double sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("WARNING! АКЧА АЗ КАЛДЫ!", getAmount());
        }
        amount -= sum;
        System.out.println("Картадан алынчу сумма:" + sum);

        return amount;
    }
}