import java.util.*;

class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String line = sc.nextLine();
        
        String[] words = line.split("\\s+");
        
        System.out.print("Reversed: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}