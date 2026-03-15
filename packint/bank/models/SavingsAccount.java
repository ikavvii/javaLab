package bank.model; // A separate package for data models [9]

import bank.interfaces.BankOperations; // Importing the interface [9]

public class SavingsAccount implements BankOperations {
    private double balance;

    public void deposit(double amount) { balance += amount; } // Must be public [11]
    public void withdraw(double amount) { balance -= amount; }
    public double getBalance() { return balance; }
}