interface BankRules {
   double MIN_BALANCE = 1000;   // public static final
}
interface LoanRules {
   double INTEREST_RATE = 8.5;  // public static final
}
class Customer implements BankRules, LoanRules {
   void displayDetails() {
       System.out.println("Minimum Balance: " + MIN_BALANCE);
       System.out.println("Loan Interest Rate: " + INTEREST_RATE + "%");
   }
}

public class TestApp {
   public static void main(String[] args) {
       Customer c = new Customer();
       c.displayDetails();
       // Accessing directly using interface name
       System.out.println("Access via Interface:");
       System.out.println(BankRules.MIN_BALANCE);
       System.out.println(LoanRules.INTEREST_RATE); // Customer.INTEREST_RATE also works
                                                    // must access in a static way
   }
}
