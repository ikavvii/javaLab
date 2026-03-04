package bank;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount() {
        accountHolder = "unnamed";
        balance = 0.0;
    }

    public BankAccount(String name, double initialBal) {
        accountHolder = name;
        balance = initialBal;
    }

    public void showAccountInfo() {
        System.out.println(accountHolder + "'s bank account balance " + balance);
    }

    public double deposit(double amount) {
        return balance += amount;
    }

    public double withdraw(double amount) {
        if (amount <= balance) {
            return balance -= amount;
        }else {
            return -1;
        }
    }
}