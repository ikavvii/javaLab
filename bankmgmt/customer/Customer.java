package customer;

import bank.BankAccount;

public class Customer {
    private String customerName;
    public BankAccount customerAccount;

    public static final int ADD_MONEY = 1;
    public static final int WITHDRAW_MONEY = 2;
    
    public Customer (String name, BankAccount acc) {
        customerName = name;
        customerAccount = acc;
    }

    public void performTransactions(int transactionType, double amount) {
        switch (transactionType) {
            case ADD_MONEY:
                double newBalance = customerAccount.deposit(amount);
                System.out.println("Deposited $" + amount + " into " + customerName + "'s account.");
                System.out.println(customerName + "'s new balance: $" + newBalance); 
                break;
            case WITHDRAW_MONEY:
                double withdrawalResult = customerAccount.withdraw(amount);
                if (withdrawalResult == -1) {
                    System.out.println("Insufficient funds for withdrawal.");
                } else {
                    System.out.println("Withdrew $" + amount + " from " + customerName + "'s account.");
                    System.out.println(customerName + "'s new balance: $" + withdrawalResult);
                }
                break;
            default:
                System.out.println("Invalid transaction type.");
        }
    }
}