import customer.Customer;
import bank.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice", new BankAccount("Alice", 1000.0));
        customer.performTransactions(Customer.ADD_MONEY, 500.0); // Deposit money
        customer.performTransactions(Customer.WITHDRAW_MONEY, 200.0); // Withdraw money
        customer.performTransactions(Customer.WITHDRAW_MONEY, 1500.0); // Attempt to withdraw more than
        customer.performTransactions(3, 100.0); // Invalid transaction type

        Customer [] customers = {
            new Customer("Bob", new BankAccount("Bob", 500.0)),
            new Customer("Charlie", new BankAccount("Charlie", 2000.0)),
            new Customer("Diana", new BankAccount("Diana", 1500.0)),
            new Customer("Eve", new BankAccount("Eve", 300.0))
        };

        // Bob gives money to Charlie
        customers[0].performTransactions(Customer.WITHDRAW_MONEY, 100.0); // Bob withdraws
        customers[1].performTransactions(Customer.ADD_MONEY, 100.0); // Charlie deposits

        // Diana gives money to Eve
        customers[2].performTransactions(Customer.WITHDRAW_MONEY, 200.0); // Diana withdraws
        customers[3].performTransactions(Customer.ADD_MONEY, 200.0); // Eve deposits

        System.out.println("\nFinal account balances:");
        for (Customer cus : customers) {
            cus.customerAccount.showAccountInfo();
        }
    }
}