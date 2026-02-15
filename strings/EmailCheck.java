import java.util.*;

class EmailCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter email: ");
        String email = sc.nextLine();
                
        int atIndex = email.indexOf('@');
        int dotIndex = email.indexOf('.', atIndex);
        
        // 1. atIndex > 0: '@' exists and is not the first character
        // 2. dotIndex > atIndex + 1: '.' exists and there is at least one char between '@' and '.'
        // 3. dotIndex < email.length() - 1: '.' is not the very last character
        
        if (atIndex > 0 && dotIndex > atIndex + 1 && dotIndex < email.length() - 1) {
            System.out.println("Output: Valid");
        } else {
            System.out.println("Output: Invalid");
        }
        
        sc.close();
    }
}