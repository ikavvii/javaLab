import java.util.*;

class Cleaner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter chat message: ");
        String msg = sc.nextLine();
        
        String cleanedMsg = String.join(" ", msg.split("\\s+")).trim().toLowerCase().replace("bad", "good");
        
        System.out.println("\nOriginal: [" + msg + "]");
        System.out.println("Output:   " + cleanedMsg);
        
        sc.close();
    }
}