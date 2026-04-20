import java.io.FileInputStream;
import java.io.IOException;

public class CountVowels {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("text.dat")) {
            int res = 0;
            int c;
            while ((c = fis.read()) != -1) {
                if ("aeiou".indexOf(Character.toLowerCase(c)) != -1) {
                    res++;
                } 
            }
            System.out.println(res + " Vowels");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}