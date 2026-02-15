import java.util.*;

class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Password: ");
        String pwd = sc.nextLine();
        
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasLength = pwd.length() >= 7; 
        
        for (int i = 0; i < pwd.length(); i++) {
            char ch = pwd.charAt(i); 
            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            }
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }
        
        if (hasLength && hasUpper && hasDigit) {
            System.out.println("Output: Strong password");
        } else {
            System.out.print("Output: Weak password");
            if (!hasLength) System.out.print("(Too short)");
            if (!hasUpper) System.out.print("(Missing uppercase)");
            if (!hasDigit) System.out.print("(Missing digit)");
        }
        System.out.println();
        
        sc.close();
    }
}