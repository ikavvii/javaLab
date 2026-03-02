import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class StringPuzzle {
    private String myString;
    private int sno;
    public static int count;

    StringPuzzle() {
        myString = "";
        sno = ++count;
    }

    StringPuzzle(String string) {
        myString = string;
        sno = ++count;
    }

    String[][] myAnagrams() {
        String[] parts = myString.split("\\s+");
        String[][] result;

        List<Integer> values = new ArrayList<>();
        List<List<String>> out = new ArrayList<>();
        for (String part: parts) {
            int value = 0;
            for (char c: part.trim().toLowerCase().toCharArray()) {
                value += c;
            }
      
            int found = values.indexOf(value);
            if (found != -1) {
                out.get(found).add(part);
            } else {
                List<String> entry = new ArrayList<>();
                entry.add(part);
                out.add(entry);
                values.add(value);
            }
        }

        result = new String[out.size()][];

        for (int i = 0; i < out.size(); i++) {
            result[i] = out.get(i).toArray(new String[0]);
        }

        return result;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Object: ").append(sno).append("\n")
        .append(Arrays.deepToString(myAnagrams()));
        return sb.toString();
    }

    public static void main(String[] args) {
        StringPuzzle obj = new StringPuzzle("eat tea tan ate nat bat");
        StringPuzzle obj2 = new StringPuzzle("listen silent hello world");
        
        System.out.println(obj);
        System.out.println(obj2);
        System.out.println("Total objects created: " + StringPuzzle.count);
         String banner = 
            "  _  __           _         ___  _____ __  ____   ____ __ _  _   \n" +
            " | |/ /          (_)       |__ \\| ____|  \\/  \\ \\ / /_ /_ | || |  \n" +
            " | ' / __ ___   ___ _ __      ) | |__ | \\  / |\\ V / | || | || |_ \n" +
            " |  < / _` \\ \\ / / | '_ \\    / /|___ \\| |\\/| | > <  | || |__   _|\n" +
            " | . \\ (_| |\\ V /| | | | |  / /_ ___) | |  | |/ . \\ | || |  | |  \n" + 
            " |_|\\_\\__,_| \\_/ |_|_| |_| |____|____/|_|  |_/_/ \\_\\|_||_|  |_|  \n";
        System.out.println(banner);
    }
}