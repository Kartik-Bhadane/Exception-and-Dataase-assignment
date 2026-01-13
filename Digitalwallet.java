package com.assignment;


class DigitalWallet {
    static double dailyTotal = 30000;

    static void transact(double amount) throws TransactionLimitExceededException {
        if (dailyTotal + amount > 50000) {
            throw new TransactionLimitExceededException("Transaction failed! Daily limit ₹50,000 exceeded.");
        }
        dailyTotal += amount;
        System.out.println("Transaction successful! Total today: ₹" + dailyTotal);
    }

    public static void main(String[] args) {
        try {
            transact(25000);
        } catch (TransactionLimitExceededException e) {
            System.out.println(e.getMessage());
        }
    }
}


class TransactionLimitExceededException extends Exception {
    public TransactionLimitExceededException(String msg) {
        super(msg);
    }
}