import java.util.Scanner;

class SentenceWords {
    public static void main(String[] a) {
        Scanner scan = new Scanner(System.in);
        String[][] words;

        System.out.print("Enter number of sentences: ");
        int n = Integer.parseInt(scan.nextLine());
        words = new String[n][];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter sentence " + (i + 1) + ": ");
            String line = scan.nextLine().trim();

            if (line.isEmpty()) {
                words[i] = new String[0];
            } else {
                words[i] = line.split("\\s+"); 
            }
        }

        System.out.println("\nWords in each sentence:");
        for (int i = 0; i < words.length; i++) {
            System.out.print("Sentence " + (i + 1) + " has " + words[i].length + " words: ");
            
            for (String w : words[i]) {
                System.out.print("[" + w + "] ");
            }
            System.out.println();
        }
        
        scan.close();
    }
}