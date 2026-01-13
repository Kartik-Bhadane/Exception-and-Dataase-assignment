package com.assignment;


class BankAccount {
 double balance = 7000;

 void withdraw(double amount) throws MinimumBalanceException {
     if (balance - amount < 1000) {
         throw new MinimumBalanceException("Withdrawal denied! Minimum balance of ₹1000 must be maintained.");
     }
     balance -= amount;
     System.out.println("Withdrawal successful. Balance: ₹" + balance);
 }

 public static void main(String[] args) {
     BankAccount acc = new BankAccount();
     try {
         acc.withdraw(4500);
     } catch (MinimumBalanceException e) {
         System.out.println(e.getMessage());
     }
 }
}
class MinimumBalanceException extends Exception {
	 public MinimumBalanceException(String msg) {
	     super(msg);
	 }
	}

