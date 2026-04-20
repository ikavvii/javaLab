import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.File;
import java.io.FileReader;

public class TextFileAnalyzer {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                FileWriter fw = new FileWriter(new File("input.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                if (line.trim().equalsIgnoreCase("stop")) {
                    break;
                }
                fw.write(line);
                fw.write(System.lineSeparator());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // analyze
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));
                PrintWriter pw = new PrintWriter(new File("report.txt"));
                StringWriter sw = new StringWriter();
                BufferedWriter bw = new BufferedWriter(new FileWriter("uppercase.txt"))) {
            String line;
            int nChars = 0, nWords = 0, nLines = 0, nUpper = 0, nLower = 0, nVowels = 0, nDigits = 0;

            while ((line = br.readLine()) != null) {
                nLines++;
                String[] token = line.trim().split(" ");
                nWords += token.length;
                for (String t : token) {
                    nChars += t.length();
                    for (int c : t.toCharArray()) {
                        if ("AEIOUaeiou".indexOf(c) != -1) {
                            nVowels++;
                        }
                        if (Character.isLowerCase(c))
                            nLower++;
                        else if (Character.isUpperCase(c))
                            nUpper++;
                        else if (Character.isDigit(c))
                            nDigits++;
                    }
                }

                // to upper case
                sw.write(line.toUpperCase());
                sw.write(System.lineSeparator());

            }
            // store input as upper case
            bw.write(sw.toString());

            StringBuilder sb = new StringBuilder();

            sb.append("--- FILES ANALYSIS REPORT ---")
                    .append("\nTotal Lines : " + nLines)
                    .append("\nTotal Words: " + nWords)
                    .append("\nTotal Characters: " + nChars)
                    .append("\nUppercase Letters: " + nUpper)
                    .append("\nLowercase Letters: " + nLower)
                    .append("\nVowels: " + nVowels)
                    .append("\nDigits: " + nDigits);

            pw.write(sb.toString());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}