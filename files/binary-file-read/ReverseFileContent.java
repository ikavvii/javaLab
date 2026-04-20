import java.io.FileInputStream;
import java.io.IOException;

public class ReverseFileContent {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("text.dat")) {
            byte[] content = fis.readAllBytes();  

            for (int i = content.length - 1; i >= 0; i--) {
                System.out.print((char) content[i]);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}