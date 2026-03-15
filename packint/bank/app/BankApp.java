package bank.app; // Application driver package [17]

import bank.interfaces.BankOperations; // Import interface [17]
import bank.model.SavingsAccount;    // Import concrete class [17]

public class BankApp {
    public static void main(String[] args) {
        // Use an interface reference to refer to a concrete object [17, 18]
        BankOperations account = new SavingsAccount(1000); 
        
        account.deposit(500);
        System.out.println("Balance: " + account.getBalance());
    }
}