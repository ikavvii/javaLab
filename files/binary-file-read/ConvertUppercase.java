import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ConvertUppercase {
    public static void main(String[] args) {
        String in = null;
        try (FileInputStream fis = new FileInputStream("names.dat")) {
            in = new String(fis.readAllBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (FileOutputStream fos = new FileOutputStream("names.dat")) {
            fos.write(in.toUpperCase().getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}