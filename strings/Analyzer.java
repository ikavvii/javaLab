import java.util.*;

class Analyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        
        int vowels = 0, digits = 0, spaces = 0;
        String lowerText = text.toLowerCase(); 
        for (int i = 0; i < text.length(); i++) {
            char ch = lowerText.charAt(i);
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } 
            else if (Character.isDigit(ch)) {
                digits++;
            } 
            else if (Character.isWhitespace(ch)) {
                spaces++;
            }
        }
        
        System.out.println("Vowels=" + vowels + " Digits=" + digits + " Spaces=" + spaces);
        sc.close();
    }
}