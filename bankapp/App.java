import bank.model.*;
import bank.service.AccountService;

public class App {
    public static void main(String[] args) {
        Account account = new Account("ACC123", 5000);
        Customer customer = new Customer("Customer", account);
        AccountService service = new AccountService();

        System.out.println("Customer Name: " + customer.getName());
        service.checkBalance(account);
        service.deposit(account, 2000);
        service.checkBalance(account);
        service.withdraw(account, 3000);
        service.checkBalance(account);
    }
}