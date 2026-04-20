import java.io.FileInputStream;
import java.io.IOException;

public class CompareFiles {
    public static void main(String[] args) {
        String file1 = "names1.dat";
        String file2 = "names.dat";

        try (FileInputStream fis1 = new FileInputStream(file1);
                FileInputStream fis2 = new FileInputStream(file2)) {

            int byte1, byte2;
            while ((byte1 = fis1.read()) != -1 && (byte2 = fis2.read()) != -1) {
                if (byte1 != byte2) {
                    System.out.println("Files are different.");
                    return;
                }
            }

            if (fis1.read() == -1 && fis2.read() == -1) {
                System.out.println("Files are identical.");
            } else {
                System.out.println("Files have different lengths.");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}