import java.io.FileInputStream;
import java.io.IOException;

public class ReadFirstNBytes {
    public static void main(String[] args) {
        int n = 10;
        byte[] data;
        try (FileInputStream fis = new FileInputStream("text.dat")) {
            data = fis.readNBytes(n);
            System.out.println(new String(data));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}