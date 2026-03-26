package exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 1000;

        try {
            System.out.print("Enter the amount to withdraw: ");
            int amount = sc.nextInt();

            if (amount > balance) {
                throw new InvalidBalanceException("Insufficient funds. Your balance is: " + balance);
            }

            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } catch (InvalidBalanceException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}