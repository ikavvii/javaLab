import java.io.*;
class TotalBytes {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("TotalBytes.java")) {
            int res = 0;
            while (fis.read() != -1)
                res++;
            System.out.println(res + " Bytes");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}