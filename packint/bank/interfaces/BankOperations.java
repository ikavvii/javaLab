package bank.interfaces; // Defining the package

public interface BankOperations { // Must be public for cross-package use
    void deposit(double amount);

    void withdraw(double amount);

    double getBalance();
}