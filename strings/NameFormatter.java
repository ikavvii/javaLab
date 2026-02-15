import java.util.*;

class NameFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter full name: ");
        String name = sc.nextLine();
        
        String cleanName = name.trim().toUpperCase();
        
        String[] parts = cleanName.split("\\s+");
        
        System.out.print(cleanName + " | Initials: ");
        for (String part : parts) {
            System.out.print(part.charAt(0) + ".");
        }
        System.out.println();
        sc.close();
    }
}