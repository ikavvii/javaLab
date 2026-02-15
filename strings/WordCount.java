import java.util.*;

class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter sentence: ");
        String line = sc.nextLine();
        
        if (line.trim().isEmpty()) {
            System.out.println("Output: 0 words");
        } else {
            String[] words = line.trim().split("\\s+");
            
            System.out.println("Output: " + words.length + " words");
        }
        
        sc.close();
    }
}