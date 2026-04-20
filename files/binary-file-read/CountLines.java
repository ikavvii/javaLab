import java.io.FileInputStream;
import java.io.IOException;

public class CountLines {
    public static void main(String[] args) {
        String fileName = "names.dat";
        int lineCount = 0;

        try (FileInputStream fis = new FileInputStream(fileName)) {
            int byteRead;

            while ((byteRead = fis.read()) != -1) {
                if (byteRead == '\n') {
                    lineCount++;  // Increment line count on newline character
                }
            }

            // If file doesn't end with a newline, make sure the last line is counted
            if (lineCount == 0 || fis.available() > 0) {
                lineCount++;
            }

            System.out.println("Number of lines: " + lineCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}